import java.util.Scanner;

public class Son_Book
{
 private int yearPublished;
 private String title;
 private String genre;

 public int getYearPublished()
{
 return new yearPublished(yearPublished);
}

  public String getTitle()
{
 return new title(title);
}

 public String getGenre()
{
 return new genre(genre);
}


/** a constructor

*/
public Son_Book(int y, String t, String g)
{
 yearPublished=y;
 title=t;
 genre=g;
}


public boolean equals(Son_Book book1, Son_Book book2)
{
  boolean equal=false;

  if(title.equals(book2.getYearPublished()) && yearPublished.equals.book2.getTitle() && genre.equals.book2.getGenre())
     equal=true;

  return equal;

}

public String toStirng()
{
 String str="The information about the book:" +yearPublished + title + genre;

  return str;
}


}//end of class