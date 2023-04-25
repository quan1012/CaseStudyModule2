package login;
import static views.Client.*;
public class Login {
    private static final Account account = new Account();
    private static final Password password = new Password();
    public static final String[] validAccount = new String[]{"quan1012", "nhanvien"};
    public static final String[] validPassword = new String[]{"Quan10121999", "123456"};

    public static void login() {
        while (inPut != 0) {
            System.out.println("-----Đăng nhập-----");
            System.out.println("Nhập tên tài khoản: ");
            String tk = checkInput.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password1 = checkInput.nextLine();
            for (String s : validAccount) {
                boolean isValid = account.validate(s);
                for (String i : validPassword) {
                    boolean isValid1 = password.validatePassword(i);
                    if (isValid && validAccount[0].equals(tk) && isValid1
                            && validPassword[0].equals(password1)) {
                        menuManage();
                        break;
                    } else if (isValid && isValid1 && validAccount[1].equals(tk) && validPassword[1].equals(password1)) {
                        menuStaff();
                        break;
                    }
                }
            }
            for (String s : validAccount) {
                for (String value : validPassword) {
                    if (!s.equals(tk) || !value.equals(password1)) {
                        loginReal();
                        break;
                    }
                }
                break;
            }
        }
    }
    public static void loginReal() {
        while (inPut != 0) {
            System.out.println("""
             ----------------------------------------------------------
            |       Bạn đã nhập sai tên tài khoản hoặc mật khẩu.       |
            |       Bạn có muốn nhập lại không?                        |
            |       0. Thoát                                           |
            |       1. Nhập lại:                                       |
             ----------------------------------------------------------
            """);
            inPut = admin.checkInt(checkInput);
            switch (inPut) {
                case 0:
                    System.exit(inPut);
                case 1:
                    login();
                    break;
                default:
                    System.out.println("Nhập lỗi.");
                    break;
            }
        }
    }
}