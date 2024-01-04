package classes;

public class Cliente {

    private String name;
    private static int USER_ID = 1;
    
    public Cliente(String name) {
        this.name = name;
        this.USER_ID++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getUSER_ID() {
        return USER_ID;
    }
    public void setUSER_ID(int user_id) {
        this.USER_ID = user_id;
    }

    /**
     * Methods
     */

}

