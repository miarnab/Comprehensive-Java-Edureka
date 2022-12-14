package Project;

import java.sql.*;

public class Movies {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","password");
			Statement statement = con.createStatement();
			ResultSet rs1 = statement.executeQuery("select director from movies where title='A Walk to Remember'");
			String director;
			while(rs1.next())
			{
				director = rs1.getString("director");
				System.out.println("Director: "+director);
			}
			rs1.close();
			ResultSet rs2 = statement.executeQuery("select title from movies where title_type='documentary'");
			String title_docu;
			while(rs2.next())
			{
				title_docu = rs2.getString("title");
				System.out.println("Title(Documentary): "+title_docu);
			}
			rs2.close();
			ResultSet rs3 = statement.executeQuery("select title from movies where title_type='documentary' and release_year='2000'");
			String title_docu_2000;
			while(rs3.next())
			{
				title_docu_2000 = rs3.getString("title");
				System.out.println("Title(Documentary,2000): "+title_docu_2000);
			}
			rs3.close();
			ResultSet rs4 = statement.executeQuery("select title from movies where director='Steven Spielberg'");
			String title_director;
			while(rs4.next())
			{
				title_director = rs4.getString("title");
				System.out.println("Title(Steven Spielberg): "+title_director);
			}
			rs4.close();
			ResultSet rs5 = statement.executeQuery("select title from movies where director='Steven Spielberg' and release_year='2012'");
			String title_director_2012;
			while(rs5.next())
			{
				title_director_2012 = rs5.getString("title");
				System.out.println("Title(Steven Spielberg,2012): "+title_director_2012);
			}
			rs5.close();
			ResultSet rs6 = statement.executeQuery("select release_year from movies where title group by release_year order by release_year desc limit 1");
			int release_year_max_movies;
			while(rs6.next())
			{
				release_year_max_movies = rs6.getInt("release_year");
				System.out.println("Release Year: "+release_year_max_movies);			
			}
			rs6.close();
			ResultSet rs7 = statement.executeQuery("select title from movies where genre like '%romance%'");
			String title_genre;
			while(rs7.next())
			{
				title_genre = rs7.getString("title");
				System.out.println("Title(Romance): "+title_genre);
			}
			rs7.close();
			ResultSet rs8 = statement.executeQuery("select title from movies where genre like '%romance%' order by no_of_imdb_votes desc limit 10");
			String title_genre_desc_10;
			while(rs8.next())
			{
				title_genre_desc_10 = rs8.getString("title");
				System.out.println("Title(Romance,DESC,10): "+title_genre_desc_10);
			}
			rs8.close();
			ResultSet rs9 = statement.executeQuery("select title from movies where genre like '%thriller%' and year>2005 order by runtime desc limit 1");
			String title_genre_desc_2005_1;
			while(rs9.next())
			{
				title_genre_desc_2005_1 = rs9.getString("title");
				System.out.println("Title(Thriller,>2005,DESC,1): "+title_genre_desc_2005_1);
			}
			rs9.close();
			ResultSet rs10 = statement.executeQuery("select title,avg(imdb_rating) as avg_imdb_rating from movies group by title");
			String title_avg_imdb_rating;
			double avg_imdb_rating;
			while(rs10.next())
			{
				title_avg_imdb_rating = rs10.getString("title");
				avg_imdb_rating = rs10.getDouble("avg_imdb_rating");
				System.out.println("Title: "+title_avg_imdb_rating+" Average IMDB Rating: "+avg_imdb_rating);
			}
			rs10.close();
			statement.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
