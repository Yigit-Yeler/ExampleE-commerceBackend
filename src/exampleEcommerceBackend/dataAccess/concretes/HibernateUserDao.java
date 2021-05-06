package exampleEcommerceBackend.dataAccess.concretes;

import exampleEcommerceBackend.dataAccess.abstracts.UserDao;
import exampleEcommerceBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName() + " kaydedildi.");
		System.out.println(user.getFirstName() + " ki�isinin " + user.geteMail() + " mailine do�rulama e postas� g�nderildi.");
		System.out.println("Do�rulama linkine t�kland� ve �yelik tamamland�.");
		
	}

}
