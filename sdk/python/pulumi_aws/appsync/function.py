# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FunctionArgs', 'Function']

@pulumi.input_type
class FunctionArgs:
    def __init__(__self__, *,
                 api_id: pulumi.Input[str],
                 data_source: pulumi.Input[str],
                 code: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_version: Optional[pulumi.Input[str]] = None,
                 max_batch_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_mapping_template: Optional[pulumi.Input[str]] = None,
                 response_mapping_template: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input['FunctionRuntimeArgs']] = None,
                 sync_config: Optional[pulumi.Input['FunctionSyncConfigArgs']] = None):
        """
        The set of arguments for constructing a Function resource.
        :param pulumi.Input[str] api_id: ID of the associated AppSync API.
        :param pulumi.Input[str] data_source: Function data source name.
        :param pulumi.Input[str] code: The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        :param pulumi.Input[str] description: Function description.
        :param pulumi.Input[str] function_version: Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        :param pulumi.Input[int] max_batch_size: Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        :param pulumi.Input[str] name: Function name. The function name does not have to be unique.
        :param pulumi.Input[str] request_mapping_template: Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        :param pulumi.Input[str] response_mapping_template: Function response mapping template.
        :param pulumi.Input['FunctionRuntimeArgs'] runtime: Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        :param pulumi.Input['FunctionSyncConfigArgs'] sync_config: Describes a Sync configuration for a resolver. See Sync Config.
        """
        pulumi.set(__self__, "api_id", api_id)
        pulumi.set(__self__, "data_source", data_source)
        if code is not None:
            pulumi.set(__self__, "code", code)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if function_version is not None:
            pulumi.set(__self__, "function_version", function_version)
        if max_batch_size is not None:
            pulumi.set(__self__, "max_batch_size", max_batch_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if request_mapping_template is not None:
            pulumi.set(__self__, "request_mapping_template", request_mapping_template)
        if response_mapping_template is not None:
            pulumi.set(__self__, "response_mapping_template", response_mapping_template)
        if runtime is not None:
            pulumi.set(__self__, "runtime", runtime)
        if sync_config is not None:
            pulumi.set(__self__, "sync_config", sync_config)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Input[str]:
        """
        ID of the associated AppSync API.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_id", value)

    @property
    @pulumi.getter(name="dataSource")
    def data_source(self) -> pulumi.Input[str]:
        """
        Function data source name.
        """
        return pulumi.get(self, "data_source")

    @data_source.setter
    def data_source(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_source", value)

    @property
    @pulumi.getter
    def code(self) -> Optional[pulumi.Input[str]]:
        """
        The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        """
        return pulumi.get(self, "code")

    @code.setter
    def code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "code", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Function description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="functionVersion")
    def function_version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        """
        return pulumi.get(self, "function_version")

    @function_version.setter
    def function_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_version", value)

    @property
    @pulumi.getter(name="maxBatchSize")
    def max_batch_size(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        """
        return pulumi.get(self, "max_batch_size")

    @max_batch_size.setter
    def max_batch_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_batch_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Function name. The function name does not have to be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="requestMappingTemplate")
    def request_mapping_template(self) -> Optional[pulumi.Input[str]]:
        """
        Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        """
        return pulumi.get(self, "request_mapping_template")

    @request_mapping_template.setter
    def request_mapping_template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_mapping_template", value)

    @property
    @pulumi.getter(name="responseMappingTemplate")
    def response_mapping_template(self) -> Optional[pulumi.Input[str]]:
        """
        Function response mapping template.
        """
        return pulumi.get(self, "response_mapping_template")

    @response_mapping_template.setter
    def response_mapping_template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "response_mapping_template", value)

    @property
    @pulumi.getter
    def runtime(self) -> Optional[pulumi.Input['FunctionRuntimeArgs']]:
        """
        Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        """
        return pulumi.get(self, "runtime")

    @runtime.setter
    def runtime(self, value: Optional[pulumi.Input['FunctionRuntimeArgs']]):
        pulumi.set(self, "runtime", value)

    @property
    @pulumi.getter(name="syncConfig")
    def sync_config(self) -> Optional[pulumi.Input['FunctionSyncConfigArgs']]:
        """
        Describes a Sync configuration for a resolver. See Sync Config.
        """
        return pulumi.get(self, "sync_config")

    @sync_config.setter
    def sync_config(self, value: Optional[pulumi.Input['FunctionSyncConfigArgs']]):
        pulumi.set(self, "sync_config", value)


@pulumi.input_type
class _FunctionState:
    def __init__(__self__, *,
                 api_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 data_source: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_id: Optional[pulumi.Input[str]] = None,
                 function_version: Optional[pulumi.Input[str]] = None,
                 max_batch_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_mapping_template: Optional[pulumi.Input[str]] = None,
                 response_mapping_template: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input['FunctionRuntimeArgs']] = None,
                 sync_config: Optional[pulumi.Input['FunctionSyncConfigArgs']] = None):
        """
        Input properties used for looking up and filtering Function resources.
        :param pulumi.Input[str] api_id: ID of the associated AppSync API.
        :param pulumi.Input[str] arn: ARN of the Function object.
        :param pulumi.Input[str] code: The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        :param pulumi.Input[str] data_source: Function data source name.
        :param pulumi.Input[str] description: Function description.
        :param pulumi.Input[str] function_id: Unique ID representing the Function object.
        :param pulumi.Input[str] function_version: Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        :param pulumi.Input[int] max_batch_size: Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        :param pulumi.Input[str] name: Function name. The function name does not have to be unique.
        :param pulumi.Input[str] request_mapping_template: Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        :param pulumi.Input[str] response_mapping_template: Function response mapping template.
        :param pulumi.Input['FunctionRuntimeArgs'] runtime: Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        :param pulumi.Input['FunctionSyncConfigArgs'] sync_config: Describes a Sync configuration for a resolver. See Sync Config.
        """
        if api_id is not None:
            pulumi.set(__self__, "api_id", api_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if code is not None:
            pulumi.set(__self__, "code", code)
        if data_source is not None:
            pulumi.set(__self__, "data_source", data_source)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if function_id is not None:
            pulumi.set(__self__, "function_id", function_id)
        if function_version is not None:
            pulumi.set(__self__, "function_version", function_version)
        if max_batch_size is not None:
            pulumi.set(__self__, "max_batch_size", max_batch_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if request_mapping_template is not None:
            pulumi.set(__self__, "request_mapping_template", request_mapping_template)
        if response_mapping_template is not None:
            pulumi.set(__self__, "response_mapping_template", response_mapping_template)
        if runtime is not None:
            pulumi.set(__self__, "runtime", runtime)
        if sync_config is not None:
            pulumi.set(__self__, "sync_config", sync_config)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the associated AppSync API.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the Function object.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def code(self) -> Optional[pulumi.Input[str]]:
        """
        The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        """
        return pulumi.get(self, "code")

    @code.setter
    def code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "code", value)

    @property
    @pulumi.getter(name="dataSource")
    def data_source(self) -> Optional[pulumi.Input[str]]:
        """
        Function data source name.
        """
        return pulumi.get(self, "data_source")

    @data_source.setter
    def data_source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_source", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Function description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="functionId")
    def function_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique ID representing the Function object.
        """
        return pulumi.get(self, "function_id")

    @function_id.setter
    def function_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_id", value)

    @property
    @pulumi.getter(name="functionVersion")
    def function_version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        """
        return pulumi.get(self, "function_version")

    @function_version.setter
    def function_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_version", value)

    @property
    @pulumi.getter(name="maxBatchSize")
    def max_batch_size(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        """
        return pulumi.get(self, "max_batch_size")

    @max_batch_size.setter
    def max_batch_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_batch_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Function name. The function name does not have to be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="requestMappingTemplate")
    def request_mapping_template(self) -> Optional[pulumi.Input[str]]:
        """
        Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        """
        return pulumi.get(self, "request_mapping_template")

    @request_mapping_template.setter
    def request_mapping_template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_mapping_template", value)

    @property
    @pulumi.getter(name="responseMappingTemplate")
    def response_mapping_template(self) -> Optional[pulumi.Input[str]]:
        """
        Function response mapping template.
        """
        return pulumi.get(self, "response_mapping_template")

    @response_mapping_template.setter
    def response_mapping_template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "response_mapping_template", value)

    @property
    @pulumi.getter
    def runtime(self) -> Optional[pulumi.Input['FunctionRuntimeArgs']]:
        """
        Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        """
        return pulumi.get(self, "runtime")

    @runtime.setter
    def runtime(self, value: Optional[pulumi.Input['FunctionRuntimeArgs']]):
        pulumi.set(self, "runtime", value)

    @property
    @pulumi.getter(name="syncConfig")
    def sync_config(self) -> Optional[pulumi.Input['FunctionSyncConfigArgs']]:
        """
        Describes a Sync configuration for a resolver. See Sync Config.
        """
        return pulumi.get(self, "sync_config")

    @sync_config.setter
    def sync_config(self, value: Optional[pulumi.Input['FunctionSyncConfigArgs']]):
        pulumi.set(self, "sync_config", value)


class Function(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 data_source: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_version: Optional[pulumi.Input[str]] = None,
                 max_batch_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_mapping_template: Optional[pulumi.Input[str]] = None,
                 response_mapping_template: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input[pulumi.InputType['FunctionRuntimeArgs']]] = None,
                 sync_config: Optional[pulumi.Input[pulumi.InputType['FunctionSyncConfigArgs']]] = None,
                 __props__=None):
        """
        Provides an AppSync Function.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.appsync.GraphQLApi("example",
            authentication_type="API_KEY",
            name="example",
            schema=\"\"\"type Mutation {
          putPost(id: ID!, title: String!): Post
        }

        type Post {
          id: ID!
          title: String!
        }

        type Query {
          singlePost(id: ID!): Post
        }

        schema {
          query: Query
          mutation: Mutation
        }
        \"\"\")
        example_data_source = aws.appsync.DataSource("example",
            api_id=example.id,
            name="example",
            type="HTTP",
            http_config=aws.appsync.DataSourceHttpConfigArgs(
                endpoint="http://example.com",
            ))
        example_function = aws.appsync.Function("example",
            api_id=example.id,
            data_source=example_data_source.name,
            name="example",
            request_mapping_template=\"\"\"{
            "version": "2018-05-29",
            "method": "GET",
            "resourcePath": "/",
            "params":{
                "headers": $utils.http.copyheaders($ctx.request.headers)
            }
        }
        \"\"\",
            response_mapping_template=\"\"\"#if($ctx.result.statusCode == 200)
            $ctx.result.body
        #else
            $utils.appendError($ctx.result.body, $ctx.result.statusCode)
        #end
        \"\"\")
        ```
        <!--End PulumiCodeChooser -->

        ### With Code

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.appsync.Function("example",
            api_id=example_aws_appsync_graphql_api["id"],
            data_source=example_aws_appsync_datasource["name"],
            name="example",
            code=std.file(input="some-code-dir").result,
            runtime=aws.appsync.FunctionRuntimeArgs(
                name="APPSYNC_JS",
                runtime_version="1.0.0",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_appsync_function` using the AppSync API ID and Function ID separated by `-`. For example:

        ```sh
        $ pulumi import aws:appsync/function:Function example xxxxx-yyyyy
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: ID of the associated AppSync API.
        :param pulumi.Input[str] code: The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        :param pulumi.Input[str] data_source: Function data source name.
        :param pulumi.Input[str] description: Function description.
        :param pulumi.Input[str] function_version: Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        :param pulumi.Input[int] max_batch_size: Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        :param pulumi.Input[str] name: Function name. The function name does not have to be unique.
        :param pulumi.Input[str] request_mapping_template: Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        :param pulumi.Input[str] response_mapping_template: Function response mapping template.
        :param pulumi.Input[pulumi.InputType['FunctionRuntimeArgs']] runtime: Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        :param pulumi.Input[pulumi.InputType['FunctionSyncConfigArgs']] sync_config: Describes a Sync configuration for a resolver. See Sync Config.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FunctionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AppSync Function.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.appsync.GraphQLApi("example",
            authentication_type="API_KEY",
            name="example",
            schema=\"\"\"type Mutation {
          putPost(id: ID!, title: String!): Post
        }

        type Post {
          id: ID!
          title: String!
        }

        type Query {
          singlePost(id: ID!): Post
        }

        schema {
          query: Query
          mutation: Mutation
        }
        \"\"\")
        example_data_source = aws.appsync.DataSource("example",
            api_id=example.id,
            name="example",
            type="HTTP",
            http_config=aws.appsync.DataSourceHttpConfigArgs(
                endpoint="http://example.com",
            ))
        example_function = aws.appsync.Function("example",
            api_id=example.id,
            data_source=example_data_source.name,
            name="example",
            request_mapping_template=\"\"\"{
            "version": "2018-05-29",
            "method": "GET",
            "resourcePath": "/",
            "params":{
                "headers": $utils.http.copyheaders($ctx.request.headers)
            }
        }
        \"\"\",
            response_mapping_template=\"\"\"#if($ctx.result.statusCode == 200)
            $ctx.result.body
        #else
            $utils.appendError($ctx.result.body, $ctx.result.statusCode)
        #end
        \"\"\")
        ```
        <!--End PulumiCodeChooser -->

        ### With Code

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws
        import pulumi_std as std

        example = aws.appsync.Function("example",
            api_id=example_aws_appsync_graphql_api["id"],
            data_source=example_aws_appsync_datasource["name"],
            name="example",
            code=std.file(input="some-code-dir").result,
            runtime=aws.appsync.FunctionRuntimeArgs(
                name="APPSYNC_JS",
                runtime_version="1.0.0",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_appsync_function` using the AppSync API ID and Function ID separated by `-`. For example:

        ```sh
        $ pulumi import aws:appsync/function:Function example xxxxx-yyyyy
        ```

        :param str resource_name: The name of the resource.
        :param FunctionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FunctionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 data_source: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_version: Optional[pulumi.Input[str]] = None,
                 max_batch_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 request_mapping_template: Optional[pulumi.Input[str]] = None,
                 response_mapping_template: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input[pulumi.InputType['FunctionRuntimeArgs']]] = None,
                 sync_config: Optional[pulumi.Input[pulumi.InputType['FunctionSyncConfigArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FunctionArgs.__new__(FunctionArgs)

            if api_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_id'")
            __props__.__dict__["api_id"] = api_id
            __props__.__dict__["code"] = code
            if data_source is None and not opts.urn:
                raise TypeError("Missing required property 'data_source'")
            __props__.__dict__["data_source"] = data_source
            __props__.__dict__["description"] = description
            __props__.__dict__["function_version"] = function_version
            __props__.__dict__["max_batch_size"] = max_batch_size
            __props__.__dict__["name"] = name
            __props__.__dict__["request_mapping_template"] = request_mapping_template
            __props__.__dict__["response_mapping_template"] = response_mapping_template
            __props__.__dict__["runtime"] = runtime
            __props__.__dict__["sync_config"] = sync_config
            __props__.__dict__["arn"] = None
            __props__.__dict__["function_id"] = None
        super(Function, __self__).__init__(
            'aws:appsync/function:Function',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            code: Optional[pulumi.Input[str]] = None,
            data_source: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            function_id: Optional[pulumi.Input[str]] = None,
            function_version: Optional[pulumi.Input[str]] = None,
            max_batch_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            request_mapping_template: Optional[pulumi.Input[str]] = None,
            response_mapping_template: Optional[pulumi.Input[str]] = None,
            runtime: Optional[pulumi.Input[pulumi.InputType['FunctionRuntimeArgs']]] = None,
            sync_config: Optional[pulumi.Input[pulumi.InputType['FunctionSyncConfigArgs']]] = None) -> 'Function':
        """
        Get an existing Function resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: ID of the associated AppSync API.
        :param pulumi.Input[str] arn: ARN of the Function object.
        :param pulumi.Input[str] code: The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        :param pulumi.Input[str] data_source: Function data source name.
        :param pulumi.Input[str] description: Function description.
        :param pulumi.Input[str] function_id: Unique ID representing the Function object.
        :param pulumi.Input[str] function_version: Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        :param pulumi.Input[int] max_batch_size: Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        :param pulumi.Input[str] name: Function name. The function name does not have to be unique.
        :param pulumi.Input[str] request_mapping_template: Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        :param pulumi.Input[str] response_mapping_template: Function response mapping template.
        :param pulumi.Input[pulumi.InputType['FunctionRuntimeArgs']] runtime: Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        :param pulumi.Input[pulumi.InputType['FunctionSyncConfigArgs']] sync_config: Describes a Sync configuration for a resolver. See Sync Config.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FunctionState.__new__(_FunctionState)

        __props__.__dict__["api_id"] = api_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["code"] = code
        __props__.__dict__["data_source"] = data_source
        __props__.__dict__["description"] = description
        __props__.__dict__["function_id"] = function_id
        __props__.__dict__["function_version"] = function_version
        __props__.__dict__["max_batch_size"] = max_batch_size
        __props__.__dict__["name"] = name
        __props__.__dict__["request_mapping_template"] = request_mapping_template
        __props__.__dict__["response_mapping_template"] = response_mapping_template
        __props__.__dict__["runtime"] = runtime
        __props__.__dict__["sync_config"] = sync_config
        return Function(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Output[str]:
        """
        ID of the associated AppSync API.
        """
        return pulumi.get(self, "api_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Function object.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def code(self) -> pulumi.Output[Optional[str]]:
        """
        The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter(name="dataSource")
    def data_source(self) -> pulumi.Output[str]:
        """
        Function data source name.
        """
        return pulumi.get(self, "data_source")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Function description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="functionId")
    def function_id(self) -> pulumi.Output[str]:
        """
        Unique ID representing the Function object.
        """
        return pulumi.get(self, "function_id")

    @property
    @pulumi.getter(name="functionVersion")
    def function_version(self) -> pulumi.Output[str]:
        """
        Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        """
        return pulumi.get(self, "function_version")

    @property
    @pulumi.getter(name="maxBatchSize")
    def max_batch_size(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        """
        return pulumi.get(self, "max_batch_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Function name. The function name does not have to be unique.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="requestMappingTemplate")
    def request_mapping_template(self) -> pulumi.Output[Optional[str]]:
        """
        Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        """
        return pulumi.get(self, "request_mapping_template")

    @property
    @pulumi.getter(name="responseMappingTemplate")
    def response_mapping_template(self) -> pulumi.Output[Optional[str]]:
        """
        Function response mapping template.
        """
        return pulumi.get(self, "response_mapping_template")

    @property
    @pulumi.getter
    def runtime(self) -> pulumi.Output[Optional['outputs.FunctionRuntime']]:
        """
        Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        """
        return pulumi.get(self, "runtime")

    @property
    @pulumi.getter(name="syncConfig")
    def sync_config(self) -> pulumi.Output[Optional['outputs.FunctionSyncConfig']]:
        """
        Describes a Sync configuration for a resolver. See Sync Config.
        """
        return pulumi.get(self, "sync_config")

