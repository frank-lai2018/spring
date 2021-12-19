package spring.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.transaction.dao.AccountDao;

@Service
@Transactional
public class AccountService {
    //注入dao
    @Autowired
    private AccountDao accountDao;

    //转账的方法
    public void accountMoney() {
//        try {
            //第一步 开启事务

            //第二步 进行业务操作
            //lucy少100
    		accountDao.reduceMoney();

            //模拟异常
            int i = 10/0;

            //mary多100
            accountDao.addMoney();

            //第三步 没有发生异常，提交事务
//        }catch(Exception e) {
            //第四步 出现异常，事务回滚
//        }
    }
}
