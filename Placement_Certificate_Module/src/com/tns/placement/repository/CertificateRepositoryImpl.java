package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository
{
	private EntityManager entityManager;
	
	

	public CertificateRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) 
	{
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) 
	{
		Certificate certificate = entityManager.find(Certificate.class , id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id)
	{
		Certificate certificate = entityManager.find(Certificate.class , id);
		entityManager.remove(certificate);
		return certificate;
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
		
		
	}

	@Override
	public Certificate deleteCertificate(Certificate certificate) {
		entityManager.remove(certificate);
		return null;
	}
}
