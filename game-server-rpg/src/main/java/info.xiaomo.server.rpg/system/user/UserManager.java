package info.xiaomo.server.rpg.system.user;

import info.xiaomo.gengine.event.EventUtil;
import info.xiaomo.gengine.utils.TimeUtil;
import info.xiaomo.server.rpg.db.DataCenter;
import info.xiaomo.server.rpg.db.DataType;
import info.xiaomo.server.rpg.entify.User;
import info.xiaomo.server.rpg.event.EventType;
import info.xiaomo.server.rpg.server.game.Session;
import info.xiaomo.server.rpg.server.game.SessionManager;
import info.xiaomo.server.rpg.util.IDUtil;
import info.xiaomo.server.rpg.util.MessageUtil;
import info.xiaomo.server.shared.protocol.user.LoginResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/13 15:02
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
@Slf4j
public class UserManager {
	private static final UserManager instance = new UserManager();

	public static UserManager getInstance() {
		return instance;
	}

	private UserManager() {
	}


	/**
	 * 登录游戏
	 *
	 * @param session session
	 */
	public void login(Session session, String loginName) {
		if (loginName.isEmpty()) {
			return;
		}
		User user = DataCenter.getUser(loginName);
		if (user == null) {
			// 新建用户
			user = createUser(loginName);
		}
		// 注册账户
		session.setUser(user);
		// 注册session
		SessionManager.getInstance().register(session);

		LoginResponse.Builder builder = LoginResponse.newBuilder();
		LoginResponse loginResponse = builder.setUserId(user.getId()).build();
		MessageUtil.sendMsg(loginResponse, user.getId());

		EventUtil.fireEvent(EventType.LOGIN, user);
	}


	/**
	 * 创建角色
	 *
	 * @param loginName loginName
	 * @return User
	 */
	private User createUser(String loginName) {
		User user = new User();
		long id = IDUtil.getId();
		user.setId(id);
		user.setLoginName(loginName);
		user.setServerId(1);
		user.setGmLevel(1);
		user.setPlatformId(1);
		user.setRegisterTime(TimeUtil.getNowOfSeconds());
		DataCenter.insertData(user, true);
		DataCenter.registerUser(user);
		return user;
	}


	/**
	 * 退出
	 */
	public void logout(Session session) {
		DataCenter.updateData(session.getUser().getId(), DataType.USER, true);
		EventUtil.fireEvent(EventType.LOGOUT, session.getUser());
	}
}