package br.corretorortografico.dao;

import br.corretorortografico.db.JPAUtil;
import br.corretorortografico.models.Word;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class WordDAO {

	private EntityManager manager;

	public WordDAO() {
		this.manager = JPAUtil.getEntityManager();
	}

	@Override
	public void finalize() {
		this.manager.close();
	}

	public List<Word> all() {
		Query query = manager.createQuery("select w from Word w");
		List<Word> list = query.getResultList();

		return list;
	}

}
