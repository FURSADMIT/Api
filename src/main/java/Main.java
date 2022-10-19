import ru.netology.json.Post;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.birthday.day = 17;
        post.birthday.month = 6;
        post.birthday.year = 1993;
        post.name = "Dmitry";
        post.passport = "0000№607786";
        post.patronymic = "Nikolaevich";
        post.phone = "+7(929)045-74-04";
        post.surname = "Fursa";
        post.subscription = true;

    }
}