# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ApiMappingArgs', 'ApiMapping']

@pulumi.input_type
class ApiMappingArgs:
    def __init__(__self__, *,
                 api_id: pulumi.Input[str],
                 domain_name: pulumi.Input[str],
                 stage: pulumi.Input[str],
                 api_mapping_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApiMapping resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] domain_name: Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        :param pulumi.Input[str] stage: API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        :param pulumi.Input[str] api_mapping_key: The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        """
        pulumi.set(__self__, "api_id", api_id)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "stage", stage)
        if api_mapping_key is not None:
            pulumi.set(__self__, "api_mapping_key", api_mapping_key)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Input[str]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_id", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def stage(self) -> pulumi.Input[str]:
        """
        API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        """
        return pulumi.get(self, "stage")

    @stage.setter
    def stage(self, value: pulumi.Input[str]):
        pulumi.set(self, "stage", value)

    @property
    @pulumi.getter(name="apiMappingKey")
    def api_mapping_key(self) -> Optional[pulumi.Input[str]]:
        """
        The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        """
        return pulumi.get(self, "api_mapping_key")

    @api_mapping_key.setter
    def api_mapping_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_mapping_key", value)


@pulumi.input_type
class _ApiMappingState:
    def __init__(__self__, *,
                 api_id: Optional[pulumi.Input[str]] = None,
                 api_mapping_key: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 stage: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApiMapping resources.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] api_mapping_key: The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        :param pulumi.Input[str] domain_name: Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        :param pulumi.Input[str] stage: API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        """
        if api_id is not None:
            pulumi.set(__self__, "api_id", api_id)
        if api_mapping_key is not None:
            pulumi.set(__self__, "api_mapping_key", api_mapping_key)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if stage is not None:
            pulumi.set(__self__, "stage", stage)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> Optional[pulumi.Input[str]]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @api_id.setter
    def api_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_id", value)

    @property
    @pulumi.getter(name="apiMappingKey")
    def api_mapping_key(self) -> Optional[pulumi.Input[str]]:
        """
        The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        """
        return pulumi.get(self, "api_mapping_key")

    @api_mapping_key.setter
    def api_mapping_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_mapping_key", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def stage(self) -> Optional[pulumi.Input[str]]:
        """
        API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        """
        return pulumi.get(self, "stage")

    @stage.setter
    def stage(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stage", value)


class ApiMapping(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 api_mapping_key: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 stage: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Amazon API Gateway Version 2 API mapping.
        More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apigatewayv2.ApiMapping("example",
            api_id=example_aws_apigatewayv2_api["id"],
            domain_name=example_aws_apigatewayv2_domain_name["id"],
            stage=example_aws_apigatewayv2_stage["id"])
        ```

        ## Import

        Using `pulumi import`, import `aws_apigatewayv2_api_mapping` using the API mapping identifier and domain name. For example:

        ```sh
         $ pulumi import aws:apigatewayv2/apiMapping:ApiMapping example 1122334/ws-api.example.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] api_mapping_key: The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        :param pulumi.Input[str] domain_name: Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        :param pulumi.Input[str] stage: API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiMappingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Amazon API Gateway Version 2 API mapping.
        More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apigatewayv2.ApiMapping("example",
            api_id=example_aws_apigatewayv2_api["id"],
            domain_name=example_aws_apigatewayv2_domain_name["id"],
            stage=example_aws_apigatewayv2_stage["id"])
        ```

        ## Import

        Using `pulumi import`, import `aws_apigatewayv2_api_mapping` using the API mapping identifier and domain name. For example:

        ```sh
         $ pulumi import aws:apigatewayv2/apiMapping:ApiMapping example 1122334/ws-api.example.com
        ```

        :param str resource_name: The name of the resource.
        :param ApiMappingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiMappingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_id: Optional[pulumi.Input[str]] = None,
                 api_mapping_key: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 stage: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiMappingArgs.__new__(ApiMappingArgs)

            if api_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_id'")
            __props__.__dict__["api_id"] = api_id
            __props__.__dict__["api_mapping_key"] = api_mapping_key
            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            if stage is None and not opts.urn:
                raise TypeError("Missing required property 'stage'")
            __props__.__dict__["stage"] = stage
        super(ApiMapping, __self__).__init__(
            'aws:apigatewayv2/apiMapping:ApiMapping',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_id: Optional[pulumi.Input[str]] = None,
            api_mapping_key: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            stage: Optional[pulumi.Input[str]] = None) -> 'ApiMapping':
        """
        Get an existing ApiMapping resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_id: API identifier.
        :param pulumi.Input[str] api_mapping_key: The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        :param pulumi.Input[str] domain_name: Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        :param pulumi.Input[str] stage: API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiMappingState.__new__(_ApiMappingState)

        __props__.__dict__["api_id"] = api_id
        __props__.__dict__["api_mapping_key"] = api_mapping_key
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["stage"] = stage
        return ApiMapping(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> pulumi.Output[str]:
        """
        API identifier.
        """
        return pulumi.get(self, "api_id")

    @property
    @pulumi.getter(name="apiMappingKey")
    def api_mapping_key(self) -> pulumi.Output[Optional[str]]:
        """
        The API mapping key. Refer to [REST API](https://docs.aws.amazon.com/apigateway/latest/developerguide/rest-api-mappings.html), [HTTP API](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-mappings.html) or [WebSocket API](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-mappings.html).
        """
        return pulumi.get(self, "api_mapping_key")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Domain name. Use the `apigatewayv2.DomainName` resource to configure a domain name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter
    def stage(self) -> pulumi.Output[str]:
        """
        API stage. Use the `apigatewayv2.Stage` resource to configure an API stage.
        """
        return pulumi.get(self, "stage")

