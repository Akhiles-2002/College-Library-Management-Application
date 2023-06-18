package in.com.dao;

import java.util.List;

import in.com.dto.Librarian;

public interface ILibrarianDao {

	public Librarian registerLibrarian(String fullname, String emailId, String contactno, String password);

	public String updateLibrarian(Librarian lib);

	public String deleteLibrarian(Integer lid);

	public Librarian searchLibrarian(Integer lid);

	public String loginLibrarian(Integer id, String password);

	public List<Librarian> showAllLibrarian();

}
