(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/kechenggoumai/add-or-update"],{"2d6e":function(e,n,i){"use strict";i.r(n);var t=i("9d05"),a=i("e428");for(var r in a)"default"!==r&&function(e){i.d(n,e,(function(){return a[e]}))}(r);i("6983");var u,o=i("f0c5"),s=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"8111d97e",null,!1,t["a"],u);n["default"]=s.exports},6922:function(e,n,i){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=a(i("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function r(e,n,i,t,a,r,u){try{var o=e[r](u),s=o.value}catch(c){return void i(c)}o.done?n(s):Promise.resolve(s).then(t,a)}function u(e){return function(){var n=this,i=arguments;return new Promise((function(t,a){var u=e.apply(n,i);function o(e){r(u,t,a,o,s,"next",e)}function s(e){r(u,t,a,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("b21c"))}.bind(null,i)).catch(i.oe)},s={data:function(){return{ruleForm:{dingdanbianhao:this.getUUID(),kechengmingcheng:"",kechengleibie:"",fengmian:"",shifougoumai:"",jiage:"",goumaishijian:"",shangjiazhanghao:"",shangjiaxingming:"",zhanghao:"",xingming:"",ispay:"",userid:""},shifougoumaiOptions:[],shifougoumaiIndex:0,user:{},ro:{dingdanbianhao:!1,kechengmingcheng:!1,kechengleibie:!1,fengmian:!1,shifougoumai:!1,jiage:!1,goumaishijian:!1,shangjiazhanghao:!1,shangjiaxingming:!1,zhanghao:!1,xingming:!1,ispay:!1,userid:!1}}},components:{wPicker:o},computed:{},onLoad:function(){var n=u(t.default.mark((function n(i){var a,r,u,o;return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return this.ruleForm.goumaishijian=this.$utils.getCurDateTime(),a=e.getStorageSync("nowTable"),n.next=4,this.$api.session(a);case 4:if(r=n.sent,this.user=r.data,this.ruleForm.zhanghao=this.user.zhanghao,this.ruleForm.xingming=this.user.xingming,this.shifougoumaiOptions="是,否".split(","),this.ruleForm.userid=e.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=e.getStorageSync("nickname")),!i.id){n.next=17;break}return this.ruleForm.id=i.id,n.next=15,this.$api.info("kechenggoumai",this.ruleForm.id);case 15:r=n.sent,this.ruleForm=r.data;case 17:if(!i.cross){n.next=72;break}u=e.getStorageSync("crossObj"),n.t0=t.default.keys(u);case 20:if((n.t1=n.t0()).done){n.next=72;break}if(o=n.t1.value,"dingdanbianhao"!=o){n.next=26;break}return this.ruleForm.dingdanbianhao=u[o],this.ro.dingdanbianhao=!0,n.abrupt("continue",20);case 26:if("kechengmingcheng"!=o){n.next=30;break}return this.ruleForm.kechengmingcheng=u[o],this.ro.kechengmingcheng=!0,n.abrupt("continue",20);case 30:if("kechengleibie"!=o){n.next=34;break}return this.ruleForm.kechengleibie=u[o],this.ro.kechengleibie=!0,n.abrupt("continue",20);case 34:if("fengmian"!=o){n.next=38;break}return this.ruleForm.fengmian=u[o],this.ro.fengmian=!0,n.abrupt("continue",20);case 38:if("shifougoumai"!=o){n.next=42;break}return this.ruleForm.shifougoumai=u[o],this.ro.shifougoumai=!0,n.abrupt("continue",20);case 42:if("jiage"!=o){n.next=46;break}return this.ruleForm.jiage=u[o],this.ro.jiage=!0,n.abrupt("continue",20);case 46:if("goumaishijian"!=o){n.next=50;break}return this.ruleForm.goumaishijian=u[o],this.ro.goumaishijian=!0,n.abrupt("continue",20);case 50:if("shangjiazhanghao"!=o){n.next=54;break}return this.ruleForm.shangjiazhanghao=u[o],this.ro.shangjiazhanghao=!0,n.abrupt("continue",20);case 54:if("shangjiaxingming"!=o){n.next=58;break}return this.ruleForm.shangjiaxingming=u[o],this.ro.shangjiaxingming=!0,n.abrupt("continue",20);case 58:if("zhanghao"!=o){n.next=62;break}return this.ruleForm.zhanghao=u[o],this.ro.zhanghao=!0,n.abrupt("continue",20);case 62:if("xingming"!=o){n.next=66;break}return this.ruleForm.xingming=u[o],this.ro.xingming=!0,n.abrupt("continue",20);case 66:if("userid"!=o){n.next=70;break}return this.ruleForm.userid=u[o],this.ro.userid=!0,n.abrupt("continue",20);case 70:n.next=20;break;case 72:this.styleChange();case 73:case"end":return n.stop()}}),n,this)})));function i(e){return n.apply(this,arguments)}return i}(),methods:{styleChange:function(){this.$nextTick((function(){}))},goumaishijianConfirm:function(e){console.log(e),this.ruleForm.goumaishijian=e.result,this.$forceUpdate()},shifougoumaiChange:function(e){this.shifougoumaiIndex=e.target.value,this.ruleForm.shifougoumai=this.shifougoumaiOptions[this.shifougoumaiIndex]},fengmianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.fengmian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=u(t.default.mark((function e(){return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.id){e.next=5;break}return e.next=3,this.$api.update("kechenggoumai",this.ruleForm);case 3:e.next=7;break;case 5:return e.next=7,this.$api.add("kechenggoumai",this.ruleForm);case 7:this.$utils.msgBack("提交成功");case 8:case"end":return e.stop()}}),e,this)})));function n(){return e.apply(this,arguments)}return n}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,i=n.getFullYear(),t=n.getMonth()+1,a=n.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(i,"-").concat(t,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,i("543d")["default"])},6983:function(e,n,i){"use strict";var t=i("cedb"),a=i.n(t);a.a},"6f77":function(e,n,i){"use strict";(function(e){i("42a8"),i("921b");t(i("66fd"));var n=t(i("2d6e"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,i("543d")["createPage"])},"9d05":function(e,n,i){"use strict";var t={"w-picker":function(){return Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(i.bind(null,"b21c"))}},a=function(){var e=this,n=e.$createElement;e._self._c},r=[];i.d(n,"b",(function(){return a})),i.d(n,"c",(function(){return r})),i.d(n,"a",(function(){return t}))},cedb:function(e,n,i){},e428:function(e,n,i){"use strict";i.r(n);var t=i("6922"),a=i.n(t);for(var r in t)"default"!==r&&function(e){i.d(n,e,(function(){return t[e]}))}(r);n["default"]=a.a}},[["6f77","common/runtime","common/vendor"]]]);