# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PublishingDestinationArgs', 'PublishingDestination']

@pulumi.input_type
class PublishingDestinationArgs:
    def __init__(__self__, *,
                 destination_arn: pulumi.Input[str],
                 detector_id: pulumi.Input[str],
                 kms_key_arn: pulumi.Input[str],
                 destination_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PublishingDestination resource.
        :param pulumi.Input[str] destination_arn: The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] kms_key_arn: The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        :param pulumi.Input[str] destination_type: Currently there is only "S3" available as destination type which is also the default value
               
               > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        """
        pulumi.set(__self__, "destination_arn", destination_arn)
        pulumi.set(__self__, "detector_id", detector_id)
        pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if destination_type is not None:
            pulumi.set(__self__, "destination_type", destination_type)

    @property
    @pulumi.getter(name="destinationArn")
    def destination_arn(self) -> pulumi.Input[str]:
        """
        The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        """
        return pulumi.get(self, "destination_arn")

    @destination_arn.setter
    def destination_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_arn", value)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> pulumi.Input[str]:
        """
        The detector ID of the GuardDuty.
        """
        return pulumi.get(self, "detector_id")

    @detector_id.setter
    def detector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "detector_id", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter(name="destinationType")
    def destination_type(self) -> Optional[pulumi.Input[str]]:
        """
        Currently there is only "S3" available as destination type which is also the default value

        > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        """
        return pulumi.get(self, "destination_type")

    @destination_type.setter
    def destination_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_type", value)


@pulumi.input_type
class _PublishingDestinationState:
    def __init__(__self__, *,
                 destination_arn: Optional[pulumi.Input[str]] = None,
                 destination_type: Optional[pulumi.Input[str]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PublishingDestination resources.
        :param pulumi.Input[str] destination_arn: The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        :param pulumi.Input[str] destination_type: Currently there is only "S3" available as destination type which is also the default value
               
               > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] kms_key_arn: The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        """
        if destination_arn is not None:
            pulumi.set(__self__, "destination_arn", destination_arn)
        if destination_type is not None:
            pulumi.set(__self__, "destination_type", destination_type)
        if detector_id is not None:
            pulumi.set(__self__, "detector_id", detector_id)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)

    @property
    @pulumi.getter(name="destinationArn")
    def destination_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        """
        return pulumi.get(self, "destination_arn")

    @destination_arn.setter
    def destination_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_arn", value)

    @property
    @pulumi.getter(name="destinationType")
    def destination_type(self) -> Optional[pulumi.Input[str]]:
        """
        Currently there is only "S3" available as destination type which is also the default value

        > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        """
        return pulumi.get(self, "destination_type")

    @destination_type.setter
    def destination_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_type", value)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> Optional[pulumi.Input[str]]:
        """
        The detector ID of the GuardDuty.
        """
        return pulumi.get(self, "detector_id")

    @detector_id.setter
    def detector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "detector_id", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)


class PublishingDestination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_arn: Optional[pulumi.Input[str]] = None,
                 destination_type: Optional[pulumi.Input[str]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        current_caller_identity = aws.get_caller_identity()
        current_region = aws.get_region()
        gd_bucket = aws.s3.BucketV2("gdBucket", force_destroy=True)
        bucket_pol = aws.iam.get_policy_document_output(statements=[
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow PutObject",
                actions=["s3:PutObject"],
                resources=[gd_bucket.arn.apply(lambda arn: f"{arn}/*")],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="Service",
                    identifiers=["guardduty.amazonaws.com"],
                )],
            ),
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow GetBucketLocation",
                actions=["s3:GetBucketLocation"],
                resources=[gd_bucket.arn],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="Service",
                    identifiers=["guardduty.amazonaws.com"],
                )],
            ),
        ])
        kms_pol = aws.iam.get_policy_document(statements=[
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow GuardDuty to encrypt findings",
                actions=["kms:GenerateDataKey"],
                resources=[f"arn:aws:kms:{current_region.name}:{current_caller_identity.account_id}:key/*"],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="Service",
                    identifiers=["guardduty.amazonaws.com"],
                )],
            ),
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow all users to modify/delete key (test only)",
                actions=["kms:*"],
                resources=[f"arn:aws:kms:{current_region.name}:{current_caller_identity.account_id}:key/*"],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="AWS",
                    identifiers=[f"arn:aws:iam::{current_caller_identity.account_id}:root"],
                )],
            ),
        ])
        test_gd = aws.guardduty.Detector("testGd", enable=True)
        gd_bucket_acl = aws.s3.BucketAclV2("gdBucketAcl",
            bucket=gd_bucket.id,
            acl="private")
        gd_bucket_policy = aws.s3.BucketPolicy("gdBucketPolicy",
            bucket=gd_bucket.id,
            policy=bucket_pol.json)
        gd_key = aws.kms.Key("gdKey",
            description="Temporary key for AccTest of TF",
            deletion_window_in_days=7,
            policy=kms_pol.json)
        test = aws.guardduty.PublishingDestination("test",
            detector_id=test_gd.id,
            destination_arn=gd_bucket.arn,
            kms_key_arn=gd_key.arn,
            opts=pulumi.ResourceOptions(depends_on=[gd_bucket_policy]))
        ```

        > **Note:** Please do not use this simple example for Bucket-Policy and KMS Key Policy in a production environment. It is much too open for such a use-case. Refer to the AWS documentation here: https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_exportfindings.html

        ## Import

        Using `pulumi import`, import GuardDuty PublishingDestination using the master GuardDuty detector ID and PublishingDestinationID. For example:

        ```sh
         $ pulumi import aws:guardduty/publishingDestination:PublishingDestination test a4b86f26fa42e7e7cf0d1c333ea77777:a4b86f27a0e464e4a7e0516d242f1234
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_arn: The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        :param pulumi.Input[str] destination_type: Currently there is only "S3" available as destination type which is also the default value
               
               > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] kms_key_arn: The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PublishingDestinationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        current_caller_identity = aws.get_caller_identity()
        current_region = aws.get_region()
        gd_bucket = aws.s3.BucketV2("gdBucket", force_destroy=True)
        bucket_pol = aws.iam.get_policy_document_output(statements=[
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow PutObject",
                actions=["s3:PutObject"],
                resources=[gd_bucket.arn.apply(lambda arn: f"{arn}/*")],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="Service",
                    identifiers=["guardduty.amazonaws.com"],
                )],
            ),
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow GetBucketLocation",
                actions=["s3:GetBucketLocation"],
                resources=[gd_bucket.arn],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="Service",
                    identifiers=["guardduty.amazonaws.com"],
                )],
            ),
        ])
        kms_pol = aws.iam.get_policy_document(statements=[
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow GuardDuty to encrypt findings",
                actions=["kms:GenerateDataKey"],
                resources=[f"arn:aws:kms:{current_region.name}:{current_caller_identity.account_id}:key/*"],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="Service",
                    identifiers=["guardduty.amazonaws.com"],
                )],
            ),
            aws.iam.GetPolicyDocumentStatementArgs(
                sid="Allow all users to modify/delete key (test only)",
                actions=["kms:*"],
                resources=[f"arn:aws:kms:{current_region.name}:{current_caller_identity.account_id}:key/*"],
                principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                    type="AWS",
                    identifiers=[f"arn:aws:iam::{current_caller_identity.account_id}:root"],
                )],
            ),
        ])
        test_gd = aws.guardduty.Detector("testGd", enable=True)
        gd_bucket_acl = aws.s3.BucketAclV2("gdBucketAcl",
            bucket=gd_bucket.id,
            acl="private")
        gd_bucket_policy = aws.s3.BucketPolicy("gdBucketPolicy",
            bucket=gd_bucket.id,
            policy=bucket_pol.json)
        gd_key = aws.kms.Key("gdKey",
            description="Temporary key for AccTest of TF",
            deletion_window_in_days=7,
            policy=kms_pol.json)
        test = aws.guardduty.PublishingDestination("test",
            detector_id=test_gd.id,
            destination_arn=gd_bucket.arn,
            kms_key_arn=gd_key.arn,
            opts=pulumi.ResourceOptions(depends_on=[gd_bucket_policy]))
        ```

        > **Note:** Please do not use this simple example for Bucket-Policy and KMS Key Policy in a production environment. It is much too open for such a use-case. Refer to the AWS documentation here: https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_exportfindings.html

        ## Import

        Using `pulumi import`, import GuardDuty PublishingDestination using the master GuardDuty detector ID and PublishingDestinationID. For example:

        ```sh
         $ pulumi import aws:guardduty/publishingDestination:PublishingDestination test a4b86f26fa42e7e7cf0d1c333ea77777:a4b86f27a0e464e4a7e0516d242f1234
        ```

        :param str resource_name: The name of the resource.
        :param PublishingDestinationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PublishingDestinationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_arn: Optional[pulumi.Input[str]] = None,
                 destination_type: Optional[pulumi.Input[str]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PublishingDestinationArgs.__new__(PublishingDestinationArgs)

            if destination_arn is None and not opts.urn:
                raise TypeError("Missing required property 'destination_arn'")
            __props__.__dict__["destination_arn"] = destination_arn
            __props__.__dict__["destination_type"] = destination_type
            if detector_id is None and not opts.urn:
                raise TypeError("Missing required property 'detector_id'")
            __props__.__dict__["detector_id"] = detector_id
            if kms_key_arn is None and not opts.urn:
                raise TypeError("Missing required property 'kms_key_arn'")
            __props__.__dict__["kms_key_arn"] = kms_key_arn
        super(PublishingDestination, __self__).__init__(
            'aws:guardduty/publishingDestination:PublishingDestination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            destination_arn: Optional[pulumi.Input[str]] = None,
            destination_type: Optional[pulumi.Input[str]] = None,
            detector_id: Optional[pulumi.Input[str]] = None,
            kms_key_arn: Optional[pulumi.Input[str]] = None) -> 'PublishingDestination':
        """
        Get an existing PublishingDestination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_arn: The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        :param pulumi.Input[str] destination_type: Currently there is only "S3" available as destination type which is also the default value
               
               > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty.
        :param pulumi.Input[str] kms_key_arn: The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PublishingDestinationState.__new__(_PublishingDestinationState)

        __props__.__dict__["destination_arn"] = destination_arn
        __props__.__dict__["destination_type"] = destination_type
        __props__.__dict__["detector_id"] = detector_id
        __props__.__dict__["kms_key_arn"] = kms_key_arn
        return PublishingDestination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="destinationArn")
    def destination_arn(self) -> pulumi.Output[str]:
        """
        The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
        """
        return pulumi.get(self, "destination_arn")

    @property
    @pulumi.getter(name="destinationType")
    def destination_type(self) -> pulumi.Output[Optional[str]]:
        """
        Currently there is only "S3" available as destination type which is also the default value

        > **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the "DescribePublishingDestination" call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
        """
        return pulumi.get(self, "destination_type")

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> pulumi.Output[str]:
        """
        The detector ID of the GuardDuty.
        """
        return pulumi.get(self, "detector_id")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
        """
        return pulumi.get(self, "kms_key_arn")

