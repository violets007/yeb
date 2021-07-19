package top.zixuan007.yeb.service.impl;

import top.zixuan007.yeb.pojo.Employee;
import top.zixuan007.yeb.mapper.EmployeeMapper;
import top.zixuan007.yeb.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zixuan007
 * @since 2021-07-19
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
