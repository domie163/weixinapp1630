const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1x9di/",
            name: "ssm1x9di",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1x9di/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "培训咨询微信小程序"
        } 
    }
}
export default base
