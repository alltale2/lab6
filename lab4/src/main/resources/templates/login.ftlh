<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <left>
Login page
<@l.login "/login" />
<a href="/registration">Sign up</a>
    </left>
</@c.page>
