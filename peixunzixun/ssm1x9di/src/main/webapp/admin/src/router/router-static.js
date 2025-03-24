import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import peixunkecheng from '@/views/modules/peixunkecheng/list'
    import zixunxiangmu from '@/views/modules/zixunxiangmu/list'
    import kechengpingjia from '@/views/modules/kechengpingjia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import xiangmupingjia from '@/views/modules/xiangmupingjia/list'
    import storeup from '@/views/modules/storeup/list'
    import kechenggoumai from '@/views/modules/kechenggoumai/list'
    import config from '@/views/modules/config/list'
    import shangjia from '@/views/modules/shangjia/list'
    import xiangmugoumai from '@/views/modules/xiangmugoumai/list'
    import yonghuzixun from '@/views/modules/yonghuzixun/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/peixunkecheng',
        name: '培训课程',
        component: peixunkecheng
      }
      ,{
	path: '/zixunxiangmu',
        name: '咨询项目',
        component: zixunxiangmu
      }
      ,{
	path: '/kechengpingjia',
        name: '课程评价',
        component: kechengpingjia
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/xiangmupingjia',
        name: '项目评价',
        component: xiangmupingjia
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/kechenggoumai',
        name: '课程购买',
        component: kechenggoumai
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
      ,{
	path: '/xiangmugoumai',
        name: '项目购买',
        component: xiangmugoumai
      }
      ,{
	path: '/yonghuzixun',
        name: '用户咨询',
        component: yonghuzixun
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
