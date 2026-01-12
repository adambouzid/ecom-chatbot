package net.adam.mcpserver.tools;

import org.springaicommunity.mcp.annotation.McpArg;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class McpTools {
    @McpTool(name ="getEmployee", description = "Get information about a given employee")
    public Employee getEmployee(@McpArg(description = "the employee name") String name) {
        return new Employee(name, 30000 , 4);
    }
    @McpTool (description = "Get ALL Employees")
    public List<Employee> getAllEmployees(){
        return List.of(
                new Employee("hassan", 12400, 5),
                new Employee("nina", 10000, 3),
                new Employee("badr", 900000, 10),
                new Employee("ADAM", 300000, 10),
        new Employee("NABIL", 700000, 10)

        );

    }

}
record Employee(String name , double salary, int seniority){ }