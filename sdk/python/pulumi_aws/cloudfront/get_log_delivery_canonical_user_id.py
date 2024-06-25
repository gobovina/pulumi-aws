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

__all__ = [
    'GetLogDeliveryCanonicalUserIdResult',
    'AwaitableGetLogDeliveryCanonicalUserIdResult',
    'get_log_delivery_canonical_user_id',
    'get_log_delivery_canonical_user_id_output',
]

@pulumi.output_type
class GetLogDeliveryCanonicalUserIdResult:
    """
    A collection of values returned by getLogDeliveryCanonicalUserId.
    """
    def __init__(__self__, id=None, region=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")


class AwaitableGetLogDeliveryCanonicalUserIdResult(GetLogDeliveryCanonicalUserIdResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLogDeliveryCanonicalUserIdResult(
            id=self.id,
            region=self.region)


def get_log_delivery_canonical_user_id(region: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLogDeliveryCanonicalUserIdResult:
    """
    The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
    See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudfront.get_log_delivery_canonical_user_id()
    example_bucket_v2 = aws.s3.BucketV2("example", bucket="example")
    example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
        bucket=example_bucket_v2.id,
        access_control_policy={
            "grants": [{
                "grantee": {
                    "id": example.id,
                    "type": "CanonicalUser",
                },
                "permission": "FULL_CONTROL",
            }],
        })
    ```


    :param str region: Region you'd like the zone for. By default, fetches the current region.
    """
    __args__ = dict()
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:cloudfront/getLogDeliveryCanonicalUserId:getLogDeliveryCanonicalUserId', __args__, opts=opts, typ=GetLogDeliveryCanonicalUserIdResult).value

    return AwaitableGetLogDeliveryCanonicalUserIdResult(
        id=pulumi.get(__ret__, 'id'),
        region=pulumi.get(__ret__, 'region'))


@_utilities.lift_output_func(get_log_delivery_canonical_user_id)
def get_log_delivery_canonical_user_id_output(region: Optional[pulumi.Input[Optional[str]]] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLogDeliveryCanonicalUserIdResult]:
    """
    The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
    See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudfront.get_log_delivery_canonical_user_id()
    example_bucket_v2 = aws.s3.BucketV2("example", bucket="example")
    example_bucket_acl_v2 = aws.s3.BucketAclV2("example",
        bucket=example_bucket_v2.id,
        access_control_policy={
            "grants": [{
                "grantee": {
                    "id": example.id,
                    "type": "CanonicalUser",
                },
                "permission": "FULL_CONTROL",
            }],
        })
    ```


    :param str region: Region you'd like the zone for. By default, fetches the current region.
    """
    ...
