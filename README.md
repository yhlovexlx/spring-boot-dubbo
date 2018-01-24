<!-- 项目结构 -->
<!DOCTYPE html>
<html>
<body>
	<h2>#各模块功能</h2>
	<table border="1px">
		<thead>
			<td>模块</td>
			<td>作用</td>
		</thead>
		<tbody>
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
		</tbody>
	</table>
	<h2>#项目部署和启动</h2>
	<ul>
		<li>安装zookeeper，拷贝并修改zoo.cfg，最后启动</li>
		<li>运行dubbo-service下的Bootstrap.java文件启动dubbo服务</li>
		<li>部署dubbo-web在tomcat服务器上并启动。</li>
	</ul>

</body>
</html>
