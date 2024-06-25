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
    'GetOriginAccessIdentitiesResult',
    'AwaitableGetOriginAccessIdentitiesResult',
    'get_origin_access_identities',
    'get_origin_access_identities_output',
]

@pulumi.output_type
class GetOriginAccessIdentitiesResult:
    """
    A collection of values returned by getOriginAccessIdentities.
    """
    def __init__(__self__, comments=None, iam_arns=None, id=None, ids=None, s3_canonical_user_ids=None):
        if comments and not isinstance(comments, list):
            raise TypeError("Expected argument 'comments' to be a list")
        pulumi.set(__self__, "comments", comments)
        if iam_arns and not isinstance(iam_arns, list):
            raise TypeError("Expected argument 'iam_arns' to be a list")
        pulumi.set(__self__, "iam_arns", iam_arns)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if s3_canonical_user_ids and not isinstance(s3_canonical_user_ids, list):
            raise TypeError("Expected argument 's3_canonical_user_ids' to be a list")
        pulumi.set(__self__, "s3_canonical_user_ids", s3_canonical_user_ids)

    @property
    @pulumi.getter
    def comments(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "comments")

    @property
    @pulumi.getter(name="iamArns")
    def iam_arns(self) -> Sequence[str]:
        """
        Set of ARNs of the matched origin access identities.
        """
        return pulumi.get(self, "iam_arns")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        Set of ids of the matched origin access identities.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="s3CanonicalUserIds")
    def s3_canonical_user_ids(self) -> Sequence[str]:
        """
        Set of S3 canonical user IDs of the matched origin access identities.
        """
        return pulumi.get(self, "s3_canonical_user_ids")


class AwaitableGetOriginAccessIdentitiesResult(GetOriginAccessIdentitiesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOriginAccessIdentitiesResult(
            comments=self.comments,
            iam_arns=self.iam_arns,
            id=self.id,
            ids=self.ids,
            s3_canonical_user_ids=self.s3_canonical_user_ids)


def get_origin_access_identities(comments: Optional[Sequence[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOriginAccessIdentitiesResult:
    """
    Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities.

    ## Example Usage

    ### All origin access identities in the account

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudfront.get_origin_access_identities()
    ```

    ### Origin access identities filtered by comment/name

    Origin access identities whose comments are `example-comment1`, `example-comment2`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudfront.get_origin_access_identities(comments=[
        "example-comment1",
        "example-comment2",
    ])
    ```


    :param Sequence[str] comments: Filter origin access identities by comment.
    """
    __args__ = dict()
    __args__['comments'] = comments
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:cloudfront/getOriginAccessIdentities:getOriginAccessIdentities', __args__, opts=opts, typ=GetOriginAccessIdentitiesResult).value

    return AwaitableGetOriginAccessIdentitiesResult(
        comments=pulumi.get(__ret__, 'comments'),
        iam_arns=pulumi.get(__ret__, 'iam_arns'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        s3_canonical_user_ids=pulumi.get(__ret__, 's3_canonical_user_ids'))


@_utilities.lift_output_func(get_origin_access_identities)
def get_origin_access_identities_output(comments: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOriginAccessIdentitiesResult]:
    """
    Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities.

    ## Example Usage

    ### All origin access identities in the account

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudfront.get_origin_access_identities()
    ```

    ### Origin access identities filtered by comment/name

    Origin access identities whose comments are `example-comment1`, `example-comment2`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.cloudfront.get_origin_access_identities(comments=[
        "example-comment1",
        "example-comment2",
    ])
    ```


    :param Sequence[str] comments: Filter origin access identities by comment.
    """
    ...
