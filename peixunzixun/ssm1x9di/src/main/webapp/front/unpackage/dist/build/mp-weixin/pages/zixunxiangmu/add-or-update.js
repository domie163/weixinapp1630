(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/zixunxiangmu/add-or-update"],{"0772":function(n,e,i){"use strict";var r=i("9b49"),a=i.n(r);a.a},"1c98":function(n,e,i){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var r=a(i("a34a"));function a(n){return n&&n.__esModule?n:{default:n}}function t(n,e,i,r,a,t,u){try{var o=n[t](u),c=o.value}catch(s){return void i(s)}o.done?e(c):Promise.resolve(c).then(r,a)}function u(n){return function(){var e=this,i=arguments;return new Promise((function(r,a){var u=n.apply(e,i);function o(n){t(u,r,a,o,c,"next",n)}function c(n){t(u,r,a,o,c,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("f88b"))}.bind(null,i)).catch(i.oe)},c={data:function(){return{ruleForm:{xiangmumingcheng:"",zixunleibie:"",zixunshijieshao:"",zixunshizhang:"",zixunduixiang:"",xiangmushoufei:"",xiangmujieshao:"",fengmian:"",shangjiazhanghao:"",shangjiaxingming:"",userid:""},user:{},ro:{xiangmumingcheng:!1,zixunleibie:!1,zixunshijieshao:!1,zixunshizhang:!1,zixunduixiang:!1,xiangmushoufei:!1,xiangmujieshao:!1,fengmian:!1,shangjiazhanghao:!1,shangjiaxingming:!1,clicktime:!1,clicknum:!1,userid:!1}}},components:{wPicker:o},computed:{},onLoad:function(e){var i=this;return u(r.default.mark((function a(){var t,u,o,c;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return t=n.getStorageSync("nowTable"),a.next=3,i.$api.session(t);case 3:if(u=a.sent,i.user=u.data,i.ruleForm.shangjiazhanghao=i.user.shangjiazhanghao,i.ruleForm.shangjiaxingming=i.user.shangjiaxingming,i.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(i.ruleForm.refid=e.refid,i.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){a.next=15;break}return i.ruleForm.id=e.id,a.next=13,i.$api.info("zixunxiangmu",i.ruleForm.id);case 13:u=a.sent,i.ruleForm=u.data;case 15:if(!e.cross){a.next=74;break}o=n.getStorageSync("crossObj"),a.t0=r.default.keys(o);case 18:if((a.t1=a.t0()).done){a.next=74;break}if(c=a.t1.value,"xiangmumingcheng"!=c){a.next=24;break}return i.ruleForm.xiangmumingcheng=o[c],i.ro.xiangmumingcheng=!0,a.abrupt("continue",18);case 24:if("zixunleibie"!=c){a.next=28;break}return i.ruleForm.zixunleibie=o[c],i.ro.zixunleibie=!0,a.abrupt("continue",18);case 28:if("zixunshijieshao"!=c){a.next=32;break}return i.ruleForm.zixunshijieshao=o[c],i.ro.zixunshijieshao=!0,a.abrupt("continue",18);case 32:if("zixunshizhang"!=c){a.next=36;break}return i.ruleForm.zixunshizhang=o[c],i.ro.zixunshizhang=!0,a.abrupt("continue",18);case 36:if("zixunduixiang"!=c){a.next=40;break}return i.ruleForm.zixunduixiang=o[c],i.ro.zixunduixiang=!0,a.abrupt("continue",18);case 40:if("xiangmushoufei"!=c){a.next=44;break}return i.ruleForm.xiangmushoufei=o[c],i.ro.xiangmushoufei=!0,a.abrupt("continue",18);case 44:if("xiangmujieshao"!=c){a.next=48;break}return i.ruleForm.xiangmujieshao=o[c],i.ro.xiangmujieshao=!0,a.abrupt("continue",18);case 48:if("fengmian"!=c){a.next=52;break}return i.ruleForm.fengmian=o[c],i.ro.fengmian=!0,a.abrupt("continue",18);case 52:if("shangjiazhanghao"!=c){a.next=56;break}return i.ruleForm.shangjiazhanghao=o[c],i.ro.shangjiazhanghao=!0,a.abrupt("continue",18);case 56:if("shangjiaxingming"!=c){a.next=60;break}return i.ruleForm.shangjiaxingming=o[c],i.ro.shangjiaxingming=!0,a.abrupt("continue",18);case 60:if("clicktime"!=c){a.next=64;break}return i.ruleForm.clicktime=o[c],i.ro.clicktime=!0,a.abrupt("continue",18);case 64:if("clicknum"!=c){a.next=68;break}return i.ruleForm.clicknum=o[c],i.ro.clicknum=!0,a.abrupt("continue",18);case 68:if("userid"!=c){a.next=72;break}return i.ruleForm.userid=o[c],i.ro.userid=!0,a.abrupt("continue",18);case 72:a.next=18;break;case 74:i.styleChange();case 75:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},clicktimeConfirm:function(n){console.log(n),this.ruleForm.clicktime=n.result,this.$forceUpdate()},fengmianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.fengmian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(r.default.mark((function e(){return r.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!n.ruleForm.xiangmushoufei||n.$validate.isIntNumer(n.ruleForm.xiangmushoufei)){e.next=3;break}return n.$utils.msg("项目收费应输入整数"),e.abrupt("return");case 3:if(!n.ruleForm.clicknum||n.$validate.isIntNumer(n.ruleForm.clicknum)){e.next=6;break}return n.$utils.msg("点击次数应输入整数"),e.abrupt("return");case 6:if(!n.ruleForm.id){e.next=11;break}return e.next=9,n.$api.update("zixunxiangmu",n.ruleForm);case 9:e.next=13;break;case 11:return e.next=13,n.$api.add("zixunxiangmu",n.ruleForm);case 13:n.$utils.msgBack("提交成功");case 14:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,i=e.getFullYear(),r=e.getMonth()+1,a=e.getDate();return"start"===n?i-=60:"end"===n&&(i+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(i,"-").concat(r,"-").concat(a)},toggleTab:function(n){this.$refs[n].show()}}};e.default=c}).call(this,i("543d")["default"])},"2c7f":function(n,e,i){"use strict";i.r(e);var r=i("6414"),a=i("a225");for(var t in a)"default"!==t&&function(n){i.d(e,n,(function(){return a[n]}))}(t);i("0772");var u,o=i("f0c5"),c=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"508c322b",null,!1,r["a"],u);e["default"]=c.exports},"430d":function(n,e,i){"use strict";(function(n){i("5b25");r(i("66fd"));var e=r(i("2c7f"));function r(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,i("543d")["createPage"])},6414:function(n,e,i){"use strict";i.d(e,"b",(function(){return a})),i.d(e,"c",(function(){return t})),i.d(e,"a",(function(){return r}));var r={wPicker:function(){return Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(i.bind(null,"f88b"))}},a=function(){var n=this,e=n.$createElement;n._self._c},t=[]},"9b49":function(n,e,i){},a225:function(n,e,i){"use strict";i.r(e);var r=i("1c98"),a=i.n(r);for(var t in r)"default"!==t&&function(n){i.d(e,n,(function(){return r[n]}))}(t);e["default"]=a.a}},[["430d","common/runtime","common/vendor"]]]);