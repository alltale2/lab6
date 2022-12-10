<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <left>
    <div>
        <@l.logout />
        <span><a href="/userList">Users</a></span>
    </div>
        <form>
            <input type="button" value="Get exchange Rates" onClick='location.href="/course"'>
        </form>
    </left>
</@c.page>