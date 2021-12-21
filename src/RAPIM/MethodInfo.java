package RAPIM;

public class MethodInfo {
    public String libraryName;  //1.库名
    public String packageName;  //2.包名
    public String className; //3.类名
    public String MethodFullName; //4.方法名
    public String methodDescription; //5.方法描述
    public String methodParams; //6.方法参数
    public String methodReturn; //7.方法返回信息

    public MethodInfo(){}

    public MethodInfo(String libraryName, String packageName, String className, String methodFullName, String methodDescription, String methodParams, String methodReturn) {
        this.libraryName = libraryName;
        this.packageName = packageName;
        this.className = className;
        this.MethodFullName = methodFullName;
        this.methodDescription = methodDescription;
        this.methodParams = methodParams;
        this.methodReturn = methodReturn;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodFullName() {
        return MethodFullName;
    }

    public void setMethodFullName(String methodFullName) {
        MethodFullName = methodFullName;
    }

    public String getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(String methodDescription) {
        this.methodDescription = methodDescription;
    }

    public String getMethodParams() {
        return methodParams;
    }

    public void setMethodParams(String methodParams) {
        this.methodParams = methodParams;
    }

    public String getMethodReturn() {
        return methodReturn;
    }

    public void setMethodReturn(String methodReturn) {
        this.methodReturn = methodReturn;
    }
}
