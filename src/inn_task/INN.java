package inn_task;

import java.util.HashSet;

public class INN {
    HashSet<User> dataBase; // Данные клиентов, реализована на основе HashSet

    public INN() {
        dataBase = new HashSet<>();
    }

    public void addNewUser(User user) throws BadUserException {
        if(this.Contains(user)) // Если пользователь уже есть в базе, то выбрасывает исключение
            throw new BadUserException("This ID is already in database: " + user.getID());
        dataBase.add(user);
    }


    public void printDataBase() {
        for(Object x : dataBase) {
            System.out.println(x);
        }
    }

    public boolean Contains(User x) {
        for (User currentUser : dataBase) {
            if(x.getID().equals(currentUser.getID()))
                return true;
        }
        return false;
    }

}