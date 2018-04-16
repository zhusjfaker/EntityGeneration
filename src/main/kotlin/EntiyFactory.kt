package entity.core.base

import org.apache.ibatis.datasource.pooled.PooledDataSource
import org.apache.ibatis.mapping.Environment
import org.apache.ibatis.session.Configuration
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory

class EntiyFactory(
        val driver: String,
        val url: String,
        val username: String,
        val password: String
) {

    fun build(): SqlSessionFactory? {
        val dataSource = PooledDataSource(driver, url, username, password);
        val transactionFactory = JdbcTransactionFactory()
        val environment = Environment("development", transactionFactory, dataSource)
        val config = Configuration(environment)
        config.addMappers("mapper")
        val sqlSessionFactory = SqlSessionFactoryBuilder().build(config)
        return sqlSessionFactory
    }

}