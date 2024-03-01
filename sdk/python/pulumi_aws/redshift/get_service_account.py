# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetServiceAccountResult',
    'AwaitableGetServiceAccountResult',
    'get_service_account',
    'get_service_account_output',
]

@pulumi.output_type
class GetServiceAccountResult:
    """
    A collection of values returned by getServiceAccount.
    """
    def __init__(__self__, arn=None, id=None, region=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the AWS Redshift service account in the selected region.
        """
        return pulumi.get(self, "arn")

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


class AwaitableGetServiceAccountResult(GetServiceAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceAccountResult(
            arn=self.arn,
            id=self.id,
            region=self.region)


def get_service_account(region: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceAccountResult:
    """
    Use this data source to get the Account ID of the [AWS Redshift Service Account](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
    in a given region for the purpose of allowing Redshift to store audit data in S3.

    > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-bucket-permissions) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
    The `redshift_get_service_account` data source has been deprecated and will be removed in a future version.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    main = aws.redshift.get_service_account()
    bucket = aws.s3.BucketV2("bucket",
        bucket="tf-redshift-logging-test-bucket",
        force_destroy=True)
    allow_audit_logging = bucket.arn.apply(lambda arn: aws.iam.get_policy_document_output(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="Put bucket policy needed for audit logging",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[main.arn],
            )],
            actions=["s3:PutObject"],
            resources=[f"{arn}/*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="Get bucket policy needed for audit logging",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[main.arn],
            )],
            actions=["s3:GetBucketAcl"],
            resources=bucket_aws_s3_bucket["arn"],
        ),
    ]))
    allow_audit_logging_bucket_policy = aws.s3.BucketPolicy("allow_audit_logging",
        bucket=bucket.id,
        policy=allow_audit_logging.json)
    ```


    :param str region: Name of the region whose AWS Redshift account ID is desired.
           Defaults to the region from the AWS provider configuration.
    """
    __args__ = dict()
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:redshift/getServiceAccount:getServiceAccount', __args__, opts=opts, typ=GetServiceAccountResult).value

    return AwaitableGetServiceAccountResult(
        arn=pulumi.get(__ret__, 'arn'),
        id=pulumi.get(__ret__, 'id'),
        region=pulumi.get(__ret__, 'region'))


@_utilities.lift_output_func(get_service_account)
def get_service_account_output(region: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceAccountResult]:
    """
    Use this data source to get the Account ID of the [AWS Redshift Service Account](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
    in a given region for the purpose of allowing Redshift to store audit data in S3.

    > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-bucket-permissions) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
    The `redshift_get_service_account` data source has been deprecated and will be removed in a future version.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    main = aws.redshift.get_service_account()
    bucket = aws.s3.BucketV2("bucket",
        bucket="tf-redshift-logging-test-bucket",
        force_destroy=True)
    allow_audit_logging = bucket.arn.apply(lambda arn: aws.iam.get_policy_document_output(statements=[
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="Put bucket policy needed for audit logging",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[main.arn],
            )],
            actions=["s3:PutObject"],
            resources=[f"{arn}/*"],
        ),
        aws.iam.GetPolicyDocumentStatementArgs(
            sid="Get bucket policy needed for audit logging",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[main.arn],
            )],
            actions=["s3:GetBucketAcl"],
            resources=bucket_aws_s3_bucket["arn"],
        ),
    ]))
    allow_audit_logging_bucket_policy = aws.s3.BucketPolicy("allow_audit_logging",
        bucket=bucket.id,
        policy=allow_audit_logging.json)
    ```


    :param str region: Name of the region whose AWS Redshift account ID is desired.
           Defaults to the region from the AWS provider configuration.
    """
    ...
