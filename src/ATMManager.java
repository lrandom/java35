import models.LoggedUser;
import models.User;

public class ATMManager {
    User[] users;
    LoggedUser loggedUser;


    public ATMManager() {
        users = new User[]{
                new User("0001", "luan", "123456", 10000000),
                new User("0002", "Nam", "123456", 50000000)
        };
    }

    public LoggedUser authenticate(String id, String password) {
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i].getId().equals(id)
                    && this.users[i].getPassword().equals(password)) {
                this.loggedUser = new LoggedUser(this.users[i], i);
                return
                        this.loggedUser;
            }
        }
        return null;
    }

    public void widthdraw(float widthdrawMoney) throws Exception {
        if (widthdrawMoney <= 0) {
            throw new Exception("So tien muon rut phai la so duong");
        }
        if (widthdrawMoney > this.loggedUser.getUser().getBalance()) {
            throw new Exception("Tien trong tai khoan khong du");
        }
        float balance = this.loggedUser.getUser().getBalance();
        this.loggedUser.getUser().setBalance(balance - widthdrawMoney);
    }


    public void printAccountInfo() {
        System.out.println("Thong tin tk voi id la" + this.loggedUser.getUser().getId());
        System.out.println("So tien trong TK" + this.loggedUser.getUser().getBalance());
    }


    public LoggedUser getLoggedUser() {
        return loggedUser;
    }
}
