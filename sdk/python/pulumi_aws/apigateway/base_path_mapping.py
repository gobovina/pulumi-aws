# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['BasePathMappingArgs', 'BasePathMapping']

@pulumi.input_type
class BasePathMappingArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 rest_api: pulumi.Input[str],
                 base_path: Optional[pulumi.Input[str]] = None,
                 stage_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BasePathMapping resource.
        :param pulumi.Input[str] domain_name: Already-registered domain name to connect the API to.
        :param pulumi.Input[str] rest_api: ID of the API to connect.
        :param pulumi.Input[str] base_path: Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        :param pulumi.Input[str] stage_name: Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "rest_api", rest_api)
        if base_path is not None:
            pulumi.set(__self__, "base_path", base_path)
        if stage_name is not None:
            pulumi.set(__self__, "stage_name", stage_name)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Already-registered domain name to connect the API to.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Input[str]:
        """
        ID of the API to connect.
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: pulumi.Input[str]):
        pulumi.set(self, "rest_api", value)

    @property
    @pulumi.getter(name="basePath")
    def base_path(self) -> Optional[pulumi.Input[str]]:
        """
        Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        """
        return pulumi.get(self, "base_path")

    @base_path.setter
    def base_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "base_path", value)

    @property
    @pulumi.getter(name="stageName")
    def stage_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        return pulumi.get(self, "stage_name")

    @stage_name.setter
    def stage_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stage_name", value)


@pulumi.input_type
class _BasePathMappingState:
    def __init__(__self__, *,
                 base_path: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 stage_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BasePathMapping resources.
        :param pulumi.Input[str] base_path: Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        :param pulumi.Input[str] domain_name: Already-registered domain name to connect the API to.
        :param pulumi.Input[str] rest_api: ID of the API to connect.
        :param pulumi.Input[str] stage_name: Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        if base_path is not None:
            pulumi.set(__self__, "base_path", base_path)
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if rest_api is not None:
            pulumi.set(__self__, "rest_api", rest_api)
        if stage_name is not None:
            pulumi.set(__self__, "stage_name", stage_name)

    @property
    @pulumi.getter(name="basePath")
    def base_path(self) -> Optional[pulumi.Input[str]]:
        """
        Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        """
        return pulumi.get(self, "base_path")

    @base_path.setter
    def base_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "base_path", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Already-registered domain name to connect the API to.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the API to connect.
        """
        return pulumi.get(self, "rest_api")

    @rest_api.setter
    def rest_api(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_api", value)

    @property
    @pulumi.getter(name="stageName")
    def stage_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        return pulumi.get(self, "stage_name")

    @stage_name.setter
    def stage_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stage_name", value)


class BasePathMapping(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_path: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 stage_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Connects a custom domain name registered via `apigateway.DomainName`
        with a deployed API so that its methods can be called via the
        custom domain name.

        ## Import

        For a non-root `base_path`:

        Using `pulumi import`, import `aws_api_gateway_base_path_mapping` using the domain name and base path. For example:

        For an empty `base_path` or, in other words, a root path (`/`):

        ```sh
        $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example example.com/
        ```
        For a non-root `base_path`:

        ```sh
        $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example example.com/base-path
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] base_path: Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        :param pulumi.Input[str] domain_name: Already-registered domain name to connect the API to.
        :param pulumi.Input[str] rest_api: ID of the API to connect.
        :param pulumi.Input[str] stage_name: Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BasePathMappingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Connects a custom domain name registered via `apigateway.DomainName`
        with a deployed API so that its methods can be called via the
        custom domain name.

        ## Import

        For a non-root `base_path`:

        Using `pulumi import`, import `aws_api_gateway_base_path_mapping` using the domain name and base path. For example:

        For an empty `base_path` or, in other words, a root path (`/`):

        ```sh
        $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example example.com/
        ```
        For a non-root `base_path`:

        ```sh
        $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example example.com/base-path
        ```

        :param str resource_name: The name of the resource.
        :param BasePathMappingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BasePathMappingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_path: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 rest_api: Optional[pulumi.Input[str]] = None,
                 stage_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BasePathMappingArgs.__new__(BasePathMappingArgs)

            __props__.__dict__["base_path"] = base_path
            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            if rest_api is None and not opts.urn:
                raise TypeError("Missing required property 'rest_api'")
            __props__.__dict__["rest_api"] = rest_api
            __props__.__dict__["stage_name"] = stage_name
        super(BasePathMapping, __self__).__init__(
            'aws:apigateway/basePathMapping:BasePathMapping',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            base_path: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            rest_api: Optional[pulumi.Input[str]] = None,
            stage_name: Optional[pulumi.Input[str]] = None) -> 'BasePathMapping':
        """
        Get an existing BasePathMapping resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] base_path: Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        :param pulumi.Input[str] domain_name: Already-registered domain name to connect the API to.
        :param pulumi.Input[str] rest_api: ID of the API to connect.
        :param pulumi.Input[str] stage_name: Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BasePathMappingState.__new__(_BasePathMappingState)

        __props__.__dict__["base_path"] = base_path
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["rest_api"] = rest_api
        __props__.__dict__["stage_name"] = stage_name
        return BasePathMapping(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="basePath")
    def base_path(self) -> pulumi.Output[Optional[str]]:
        """
        Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        """
        return pulumi.get(self, "base_path")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Already-registered domain name to connect the API to.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="restApi")
    def rest_api(self) -> pulumi.Output[str]:
        """
        ID of the API to connect.
        """
        return pulumi.get(self, "rest_api")

    @property
    @pulumi.getter(name="stageName")
    def stage_name(self) -> pulumi.Output[Optional[str]]:
        """
        Name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        """
        return pulumi.get(self, "stage_name")

