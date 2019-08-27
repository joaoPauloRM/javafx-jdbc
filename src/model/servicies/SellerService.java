package model.servicies;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao sellerDao = DaoFactory.createSellerDao();

	public List<Seller> findAll() {
		return sellerDao.findAll();

	}

	public void saveOrUpdate(Seller seller) {
		if (seller.getId() == null) {
			sellerDao.insert(seller);
		} else {
			sellerDao.update(seller);
		}
	}

}
