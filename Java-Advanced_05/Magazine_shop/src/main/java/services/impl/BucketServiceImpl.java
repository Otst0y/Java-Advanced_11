package services.impl;

import dao.BucketDao;
import dao.impl.BucketDaoImpl;
import domain.Bucket;
import services.BucketService;

import java.sql.SQLException;
import java.util.List;

public class BucketServiceImpl implements BucketService {
    private BucketDao bucketDao;

    public BucketServiceImpl() {
        try {
            bucketDao = new BucketDaoImpl();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Bucket create(Bucket bucket) {
        return bucketDao.create(bucket);
    }

    @Override
    public Bucket read(Integer id) {
        return bucketDao.read(id);
    }

    @Override
    public Bucket update(Bucket bucket) {
        return bucketDao.update(bucket);
    }

    @Override
    public void delete(Integer id) {
        bucketDao.delete(id);
    }

    @Override
    public List<Bucket> readAll() {
        return bucketDao.readAll();
    }
}
