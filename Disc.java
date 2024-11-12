    public abstract class Disc {
    protected Player player;
    protected Position position;
        abstract String getType();

        public Position position() {
            return position;
        }
        public void setOwner(Player player){
            this.player = player;
        }
        public Player getOwner(){
            return player;
        }


    }

