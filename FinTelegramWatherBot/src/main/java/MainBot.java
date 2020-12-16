import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainBot extends TelegramLongPollingBot {

    private Message prev_message = new Message();

    public void setPrev_message(Message prev_message) {

        this.prev_message = prev_message;
    }

    public String getPrev_message() {
        if (prev_message.getText() == null){
            return "no";
        }else{
            return prev_message.getText();
        }
    }

    public static void main(String[] args) {
        ApiContextInitializer.init(); // инициализация API
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(); // Объект API
        try {
            telegramBotsApi.registerBot(new MainBot());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            setButtons(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    // приём сообщений через LongPool, метод для обновления
    public void onUpdateReceived(Update update) {
        Model model = new Model();
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            if (message.getText().equals("/start")) {
                sendStart(message);
                setPrev_message(message);
            } else if (message.getText().equals("/help")) {
                sendHelp(message);
                setPrev_message(message);
            } else if (message.getText().equals("/today")) {
                sendCityInfo(message);
                setPrev_message(message);
            } else if (getPrev_message().equals("/today")) {
                try {
                    sendMessage(message, Weather.getWeather(message.getText(),model));
                } catch (IOException e) {
                    sendMessage(message, "Город не найден!");
                }
            }
        }else{
            unknown(message);
        }
    }

    public void sendStart(Message message) {
        // Функция отправки стартового сообщения
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true); // включить возможность разметки
        sendMessage.setChatId(message.getChatId());  // чат, в который отправляем сообщение
        String start = "Привет!\nЯ, YourWeather, бот, способный рассказать тебе по сегодняшнюю погоду " +
                "в твоём городе!\n\nНапиши /help, если хочешь узнать подробнее о работе со мной";
        sendMessage.setText(start);
        try {
            execute(sendMessage);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendHelp(Message message) {
        // Функция отправки сообщения с помощью
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true); // включить возможность разметки
        sendMessage.setChatId(message.getChatId());  // чат, в который отправляем сообщение
        String help = "Сейчас расскажу про все мои команды!\n\n/start - начать работу с ботом и получить" +
                " приветственное сообщение\n/help - получить информацию по работе с ботом\n/today - получить текущую " +
                "погоду и прогноз на день в зависимости от местоположения\n";
        sendMessage.setText(help);
        try {
            execute(sendMessage);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendCityInfo(Message message) {
        // Функция выяснения места для получения текущего прогноза по месту
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true); // включить возможность разметки
        sendMessage.setChatId(message.getChatId());  // чат, в который отправляем сообщение
        String query = "Отправь мне название места, погоду которого ты хочешь узнать!";
        sendMessage.setText(query);
        try {
            execute(sendMessage);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void unknown(Message message){
        // Функция обработки всех неизвестных боту сообщений
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true); // включить возможность разметки
        sendMessage.setChatId(message.getChatId()); // чат, в который отправляем сообщение
        sendMessage.setText("Прости, но такого я понять не могу..."); // текст сообщения
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    // создание кнопок под клавиатурой
    public void setButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("/help"));
        keyboardFirstRow.add(new KeyboardButton("/settings"));

        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }

    // возвращение имени Бота
    public String getBotUsername() {
        return "FinTelegramWeatherBot";
    }

    // токен
    public String getBotToken() {
        return "1412755019:AAEuzWHqDjoi5r8lfyEvQGVL_Derf-RWnIQ";
    }
}
