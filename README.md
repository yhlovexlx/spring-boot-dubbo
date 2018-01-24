<!-- 项目结构 -->
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
    <h2>#各模块功能</h2>
	<table border="1px">
		<tr>
			<td>模块</td>
			<td>作用</td>
		</tr>
		<tr>
			<td>dubbo-bean</td>
			<td>底层实体bean封装</td>
		</tr>
		<tr>
			<td>dubbo-dao</td>
			<td>这个模块主要是数据持久化层，主要用来操作数据库</td>
		</tr>
		<tr>
			<td>dubbo-api</td>
			<td>这个模块主要提供API服务，里面都是接口</td>
		</tr>
		<tr>
			<td>dubbo-service</td>
			<td>这个模块通过暴露服务，并对外提供服务</td>
		</tr>
		<tr>
			<td>dubbo-web</td>
			<td>这个模块对外提供HTTP接口，并调用dubbo服务</td>
		</tr>
	</table>
</body>
</html>
