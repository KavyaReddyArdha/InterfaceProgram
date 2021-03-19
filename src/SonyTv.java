interface Electronics{
  public void cost();
  public void inches();
}

class SonyTv implements Electronics{
    public void cost(){
        System.out.println("The cost of SonyTv is 1,500");
    }
    public void inches(){
        System.out.println("The inches of SonyTv is 54inches");
    }

    public static void main(String args[]) {
        Electronics e = new SonyTv();
        e.cost();
        e.inches();
    }

    }

