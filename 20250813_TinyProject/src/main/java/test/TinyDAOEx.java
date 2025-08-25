package test;

import java.util.List;

import dao.TinyDAO;
import dto.TinyDTO;

public class TinyDAOEx {

	public static void main(String[] args) {
		TinyDAO dao = new TinyDAO();
		
		dao.insertOne(new TinyDTO(0,"사랑합니다."));
		dao.updateOne(new TinyDTO(1,"집에가고싶다."));
		dao.deleteOne(new TinyDTO(25, null));
		
		List<TinyDTO> list = dao.selectlist();
		for(TinyDTO dto : list) {
			System.out.println(dto);
		}

	}

}
