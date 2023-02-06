package service;

import mapper.DeliveryProviderMapper;

import model.DeliveryProvider;

import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class DeliveryProviderService {
    public DeliveryProvider getDeliveryProviderById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            return deliveryProviderMapper.getDeliveryProviderById(id);
        } finally {
            sqlSession.close();
        }
    }

    public void insertDeliveryProvider(DeliveryProvider deliveryProvider) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            deliveryProviderMapper.saveDeliveryProvider(deliveryProvider);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public void updateDeliveryProvider(DeliveryProvider deliveryProvider) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            deliveryProviderMapper.updateDeliveryProvider(deliveryProvider);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public void deleteDeliveryProvider(DeliveryProvider deliveryProvider) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            deliveryProviderMapper.deleteDeliveryProvider(deliveryProvider);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Map<Integer, DeliveryProvider> getAllDeliveryProvider() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            return deliveryProviderMapper.getAllDeliveryProvider();
        } finally {
            sqlSession.close();
        }
    }

}

