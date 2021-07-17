package prosayj.springtest.circularreferences.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import prosayj.springtest.circularreferences.service.AService;
import prosayj.springtest.circularreferences.service.BService;

/**
 * 循环依赖测试
 *
 * @author yangjian
 * @since 1.0.0 <br>  2021-07-16 下午 05:41
 */
@Component("bService")
public class BServiceImpl implements BService {
	@Autowired
	private AService aService;

//	public BServiceImpl(AService aService) {
//		this.aService = aService;
//	}



}
