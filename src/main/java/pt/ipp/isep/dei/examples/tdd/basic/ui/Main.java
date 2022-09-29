package pt.ipp.isep.dei.examples.tdd.basic.ui;

import pt.ipp.isep.dei.examples.tdd.basic.domain.Bookmark;
import pt.ipp.isep.dei.examples.tdd.basic.domain.BookmarkingTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        //testing my webhook
       /* Bookmark bm = new Bookmark("https://facebook.com");
        Thread.sleep(1000);
        Bookmark bm1 = new Bookmark("https://www.techiedelight.com/sort-list-of-objects-using-comparator-java/");
        Thread.sleep(1000);
        Bookmark bm2 = new Bookmark("https://www.hltv.org/matches");
        BookmarkingTool bt = new BookmarkingTool();
        bt.addBookmark(bm);
        bt.addBookmark(bm);
        bt.addBookmark(bm1);
        bt.addBookmark(bm1);
        bt.addBookmark(bm1);
        bt.addBookmark(bm1);
        bt.addBookmark(bm1);
        bt.addBookmark(bm2);
        bt.addBookmark(bm2);
        bt.addBookmark(bm2);

        for(Bookmark bookmark: bt.allBookmarks){
            System.out.println(bookmark.toString());
        }

        bt.filterByRating();
        for(Bookmark bookmark: bt.allBookmarks){
            System.out.println(bookmark.toString());
        }

        bt.filterByDate();
        for(Bookmark bookmark: bt.allBookmarks){
            System.out.println(bookmark.toString());
        }

        /*for(Bookmark bookmark: bt.allBookmarks){
            System.out.println(bookmark.getDate());
        }

        bt.saveBookmarks();


        System.out.println("Deserialization in progress..");
        bt.restoreBookmarks();
        for(Bookmark bookmark: bt.restoredBookmarks){
            System.out.println(bookmark.toString());
        } */
    }

}
