class Test                                              
{
    static void ReserveName(String name) throws SusmitaException
    {
        if(name == "SusmitaException")
        {
            throw new SusmitaException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("Susmita");
        } 
        catch (SusmitaException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    
}