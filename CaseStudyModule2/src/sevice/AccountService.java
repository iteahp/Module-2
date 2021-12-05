package sevice;

import io.ReadAndWriteFile;
import model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService{
    List<Account> accounts = new ArrayList<>();
    ReadAndWriteFile<Account> accountReadAndWriteFile = new ReadAndWriteFile<>();
    public static final String FILE_PATH = "C:\\Users\\MSI\\Desktop\\Module2\\CaseStudyModule2\\account.txt";
    public AccountService(){
        accountReadAndWriteFile.readFromFile(FILE_PATH);
    }
    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public void save(Account account) {
        accounts.add(account);
        accountReadAndWriteFile.writeToFile(FILE_PATH,accounts);
    }
    @Override
    public void delete(int index) {
        accounts.remove(index);
        accountReadAndWriteFile.writeToFile(FILE_PATH,accounts);
    }

    @Override
    public Account edit(int index) {
        return accounts.get(index);
    }


    @Override
    public int findIndexByAccount(String account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (account.equals(accounts.get(i).getAccount())){
                return i;
            }
        }
        return -1;
    }
    public boolean loginAccount(Account account){
        for (Account acc:accounts) {
            if (acc.getAccount().equals(account.getAccount())&&acc.getPassword().equals(account.getPassword())){
                return true;
            }
        }
        return false;
    }
    public boolean loginAdmin(Account account){
        if (account.getAccount().equals("admin") && account.getPassword().equals("admin")){
            return true;
        }
        return false;
    }

}
