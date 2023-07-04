package Lab11;

import java.io.File;

public class ListDir {
    static void ListDir(File[] f, int index, int level){
        if(index == f.length){
            return;
        }

        for(int i = 0; i < level; i++){
            System.out.print("\t");
        }
        if (f[index].isFile())
            System.out.println(f[index].getName());
        else if(f[index].isDirectory()){
            System.out.println("[" + f[index].getName()
                    + "]");
            ListDir(f[index].listFiles(), 0,
                    level + 1);
        }

        ListDir(f,index+1,level);
    }


    public static void main(String[] args) {
        File f = new File("C:\\Users\\ksukr\\Desktop\\Experimentation\\Java\\OOPS\\src");
        ListDir(f.listFiles(),0,0);
    }

}
