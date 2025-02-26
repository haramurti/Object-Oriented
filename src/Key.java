public enum Key {
    DO('C'),
    RE('D'),
    MI('E'),
    FA('F'),
    SOL('G'),
    LA('A'),
    SI('B');

    char notes;

    Key(char notes ){
        this.notes=notes;
    }

    public void playsound (Key key){
        switch(key){
            case SOL:
            System.out.println("the key this is " + key.notes);
            break;
        }
        
    }

    //javaenums

}
