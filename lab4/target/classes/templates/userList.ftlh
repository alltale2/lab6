<#import "parts/common.ftlh" as c>
<@c.page>
    <center>
    List of user
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Role</th>
            <th>Email</th>
            <th>Password</th>
            <th>Refresh</th>
        </tr>
        </thead>
        <tbody>

        <#list user as users>
            <tr>
                <td>${users.username}</td>
                <td><#list users.roles as role> ${role} <#sep>, </#list></td>
                <td>${users.email}</td>
                <td><center>${users.password}</center></td>
                <td><center>${users.refresh}</center></td>
            </tr>
        </#list>

        </tbody>
    </table>
    </center>
</@c.page>