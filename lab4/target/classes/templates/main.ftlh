<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <center>
    <div>
        <@l.logout />
        <span><a href="/userList">User list</a></span>
    </div>
        <form>
            <input type="button" value="Get exchange Rates" onClick='location.href="/course"'>
        </form>
    </center>
</@c.page>