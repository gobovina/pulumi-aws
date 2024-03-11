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

__all__ = [
    'GetQueryLogConfigResult',
    'AwaitableGetQueryLogConfigResult',
    'get_query_log_config',
    'get_query_log_config_output',
]

@pulumi.output_type
class GetQueryLogConfigResult:
    """
    A collection of values returned by getQueryLogConfig.
    """
    def __init__(__self__, arn=None, destination_arn=None, filters=None, id=None, name=None, owner_id=None, resolver_query_log_config_id=None, share_status=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if destination_arn and not isinstance(destination_arn, str):
            raise TypeError("Expected argument 'destination_arn' to be a str")
        pulumi.set(__self__, "destination_arn", destination_arn)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if resolver_query_log_config_id and not isinstance(resolver_query_log_config_id, str):
            raise TypeError("Expected argument 'resolver_query_log_config_id' to be a str")
        pulumi.set(__self__, "resolver_query_log_config_id", resolver_query_log_config_id)
        if share_status and not isinstance(share_status, str):
            raise TypeError("Expected argument 'share_status' to be a str")
        pulumi.set(__self__, "share_status", share_status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="destinationArn")
    def destination_arn(self) -> str:
        return pulumi.get(self, "destination_arn")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetQueryLogConfigFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="resolverQueryLogConfigId")
    def resolver_query_log_config_id(self) -> Optional[str]:
        return pulumi.get(self, "resolver_query_log_config_id")

    @property
    @pulumi.getter(name="shareStatus")
    def share_status(self) -> str:
        return pulumi.get(self, "share_status")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")


class AwaitableGetQueryLogConfigResult(GetQueryLogConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQueryLogConfigResult(
            arn=self.arn,
            destination_arn=self.destination_arn,
            filters=self.filters,
            id=self.id,
            name=self.name,
            owner_id=self.owner_id,
            resolver_query_log_config_id=self.resolver_query_log_config_id,
            share_status=self.share_status,
            tags=self.tags)


def get_query_log_config(filters: Optional[Sequence[pulumi.InputType['GetQueryLogConfigFilterArgs']]] = None,
                         name: Optional[str] = None,
                         resolver_query_log_config_id: Optional[str] = None,
                         tags: Optional[Mapping[str, str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQueryLogConfigResult:
    """
    `route53.ResolverQueryLogConfig` provides details about a specific Route53 Resolver Query Logging Configuration.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_query_log_config(resolver_query_log_config_id="rqlc-1abc2345ef678g91h")
    ```
    <!--End PulumiCodeChooser -->

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_query_log_config(filters=[
        aws.route53.GetQueryLogConfigFilterArgs(
            name="Name",
            values=["shared-query-log-config"],
        ),
        aws.route53.GetQueryLogConfigFilterArgs(
            name="ShareStatus",
            values=["SHARED_WITH_ME"],
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetQueryLogConfigFilterArgs']] filters: One or more name/value pairs to use as filters. There are
           several valid keys, for a full reference, check out
           [Route53resolver Filter value in the AWS API reference][1].
           
           In addition to all arguments above, the following attributes are exported:
    :param str name: The name of the query logging configuration.
    :param str resolver_query_log_config_id: ID of the Route53 Resolver Query Logging Configuration.
    :param Mapping[str, str] tags: Map of tags to assign to the service.
           
           [1]: https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_Filter.html
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['name'] = name
    __args__['resolverQueryLogConfigId'] = resolver_query_log_config_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:route53/getQueryLogConfig:getQueryLogConfig', __args__, opts=opts, typ=GetQueryLogConfigResult).value

    return AwaitableGetQueryLogConfigResult(
        arn=pulumi.get(__ret__, 'arn'),
        destination_arn=pulumi.get(__ret__, 'destination_arn'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        resolver_query_log_config_id=pulumi.get(__ret__, 'resolver_query_log_config_id'),
        share_status=pulumi.get(__ret__, 'share_status'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_query_log_config)
def get_query_log_config_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetQueryLogConfigFilterArgs']]]]] = None,
                                name: Optional[pulumi.Input[Optional[str]]] = None,
                                resolver_query_log_config_id: Optional[pulumi.Input[Optional[str]]] = None,
                                tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetQueryLogConfigResult]:
    """
    `route53.ResolverQueryLogConfig` provides details about a specific Route53 Resolver Query Logging Configuration.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_query_log_config(resolver_query_log_config_id="rqlc-1abc2345ef678g91h")
    ```
    <!--End PulumiCodeChooser -->

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.route53.get_query_log_config(filters=[
        aws.route53.GetQueryLogConfigFilterArgs(
            name="Name",
            values=["shared-query-log-config"],
        ),
        aws.route53.GetQueryLogConfigFilterArgs(
            name="ShareStatus",
            values=["SHARED_WITH_ME"],
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetQueryLogConfigFilterArgs']] filters: One or more name/value pairs to use as filters. There are
           several valid keys, for a full reference, check out
           [Route53resolver Filter value in the AWS API reference][1].
           
           In addition to all arguments above, the following attributes are exported:
    :param str name: The name of the query logging configuration.
    :param str resolver_query_log_config_id: ID of the Route53 Resolver Query Logging Configuration.
    :param Mapping[str, str] tags: Map of tags to assign to the service.
           
           [1]: https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_Filter.html
    """
    ...
