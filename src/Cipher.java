import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cipher {
    static String string() throws IOException {  //Вводим строку для шифрования
        System.out.println("Введите строку для шифрования");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return string;
    }

    static String cipher(String string) throws NoSuchAlgorithmException { //Преобразование строки в шифр MD5
        System.out.println("Шифр Md5 для строки " + "\"" + string + "\"");
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(string.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02X ", b));
        }
        return builder.toString();
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        System.out.println(cipher(string())); //Вводим строку, преобразуемм ее в шифр, выводим шифр
    }
}
