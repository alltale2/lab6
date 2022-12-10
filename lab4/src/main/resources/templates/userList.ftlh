<#import "parts/common.ftlh" as c>
<@c.page>
    <left>
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
                <td><left>${users.password}</left></td>
                <td><left>${users.refresh}</left></td>
            </tr>
        </#list>

        </tbody>
    </table>
    </left>
</@c.page>