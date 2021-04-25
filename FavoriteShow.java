import java.io.*;
import java.util.Scanner;

public class FavoriteShow {

    public static void main(String[] args) {

        addFavoriteTVShows();
        getFavoriteShows();

    }

    public static void addFavoriteTVShows() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("FavoriteShows.txt"));
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Add a tv show to your list of favorites: ");
                String show = scanner.nextLine();
                bw.write(show + "\n");
                System.out.println("Success: added " + show);
                System.out.println("Add another show? (y/n)");
                String userInput = scanner.nextLine();
                if (!userInput.equals("y")) {
                    break;
                }

            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception when writing to FavoriteShows.txt: " + e.getMessage());
        }
    }

    public static void getFavoriteShows() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("FavoriteShows.txt"));
            String fileData;
            while ((fileData = br.readLine()) !=null) {
                System.out.println(fileData);

        }
    } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception when reading from FavoriteShows.txt: "+ e.getMessage());
        }

}


}
