# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ResourceArgs', 'Resource']

@pulumi.input_type
class ResourceArgs:
    def __init__(__self__, *,
                 parent_id: pulumi.Input[str],
                 path_part: pulumi.Input[str],
                 rest_api: pulumi.Input[str]):
        """
        The set of arguments for constructing a Resource resource.
        :param pulumi.Input[str] parent_id: ID of the parent API resource
        :param pulumi.Input[str] path_part: Last path segment of this API resource.
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        pulumi.set(__self__, "parent_id", parent_id)
        pulumi.set(__self__, "path_part", path_part)
        pulumi.set(__self__, "rest_api", rest_api)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Input[str]:
        """
        ID of the parent API resource
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter(name="pathPart")
    def path_part(self) -> pulumi.Input[str]:
        """
        Last path segment of this API resource.
        """
        return pulumi.get(self, "path_part")

    @path_part.setter
    def path_part(self, value: pulumi.Input[str]):
        pulumi.set(self, "path_part", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Input[str]:
        """
        ID of the associated REST API
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: pulumi.Input[str]):
        pulumi.set(self, "rest_api", value)


@pulumi.input_type
class _ResourceState:
    def __init__(__self__, *,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 path_part: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Resource resources.
        :param pulumi.Input[str] parent_id: ID of the parent API resource
        :param pulumi.Input[str] path: Complete path for this API resource, including all parent paths.
        :param pulumi.Input[str] path_part: Last path segment of this API resource.
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if path_part is not None:
            pulumi.set(__self__, "path_part", path_part)
        if rest_api is not None:
            pulumi.set(__self__, "rest_api", rest_api)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the parent API resource
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        Complete path for this API resource, including all parent paths.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="pathPart")
    def path_part(self) -> Optional[pulumi.Input[str]]:
        """
        Last path segment of this API resource.
        """
        return pulumi.get(self, "path_part")

    @path_part.setter
    def path_part(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path_part", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the associated REST API
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_api", value)


class Resource(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 path_part: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an API Gateway Resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        my_demo_api = aws.apigateway.RestApi("MyDemoAPI",
            name="MyDemoAPI",
            description="This is my API for demonstration purposes")
        my_demo_resource = aws.apigateway.Resource("MyDemoResource",
            rest_api=my_demo_api.id,
            parent_id=my_demo_api.root_resource_id,
            path_part="mydemoresource")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_api_gateway_resource` using `REST-API-ID/RESOURCE-ID`. For example:

        ```sh
        $ pulumi import aws:apigateway/resource:Resource example 12345abcde/67890fghij
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] parent_id: ID of the parent API resource
        :param pulumi.Input[str] path_part: Last path segment of this API resource.
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an API Gateway Resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        my_demo_api = aws.apigateway.RestApi("MyDemoAPI",
            name="MyDemoAPI",
            description="This is my API for demonstration purposes")
        my_demo_resource = aws.apigateway.Resource("MyDemoResource",
            rest_api=my_demo_api.id,
            parent_id=my_demo_api.root_resource_id,
            path_part="mydemoresource")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import `aws_api_gateway_resource` using `REST-API-ID/RESOURCE-ID`. For example:

        ```sh
        $ pulumi import aws:apigateway/resource:Resource example 12345abcde/67890fghij
        ```

        :param str resource_name: The name of the resource.
        :param ResourceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 path_part: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceArgs.__new__(ResourceArgs)

            if parent_id is None and not opts.urn:
                raise TypeError("Missing required property 'parent_id'")
            __props__.__dict__["parent_id"] = parent_id
            if path_part is None and not opts.urn:
                raise TypeError("Missing required property 'path_part'")
            __props__.__dict__["path_part"] = path_part
            if rest_api is None and not opts.urn:
                raise TypeError("Missing required property 'rest_api'")
            __props__.__dict__["rest_api"] = rest_api
            __props__.__dict__["path"] = None
        super(Resource, __self__).__init__(
            'aws:apigateway/resource:Resource',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            parent_id: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            path_part: Optional[pulumi.Input[str]] = None,
            rest_api: Optional[pulumi.Input[str]] = None) -> 'Resource':
        """
        Get an existing Resource resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] parent_id: ID of the parent API resource
        :param pulumi.Input[str] path: Complete path for this API resource, including all parent paths.
        :param pulumi.Input[str] path_part: Last path segment of this API resource.
        :param pulumi.Input[str] rest_api: ID of the associated REST API
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceState.__new__(_ResourceState)

        __props__.__dict__["parent_id"] = parent_id
        __props__.__dict__["path"] = path
        __props__.__dict__["path_part"] = path_part
        __props__.__dict__["rest_api"] = rest_api
        return Resource(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Output[str]:
        """
        ID of the parent API resource
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        Complete path for this API resource, including all parent paths.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="pathPart")
    def path_part(self) -> pulumi.Output[str]:
        """
        Last path segment of this API resource.
        """
        return pulumi.get(self, "path_part")

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Output[str]:
        """
        ID of the associated REST API
        """
        return pulumi.get(self, "rest_api")

