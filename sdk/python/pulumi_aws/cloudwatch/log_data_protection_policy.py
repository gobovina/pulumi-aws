# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LogDataProtectionPolicyArgs', 'LogDataProtectionPolicy']

@pulumi.input_type
class LogDataProtectionPolicyArgs:
    def __init__(__self__, *,
                 log_group_name: pulumi.Input[str],
                 policy_document: pulumi.Input[str]):
        """
        The set of arguments for constructing a LogDataProtectionPolicy resource.
        :param pulumi.Input[str] log_group_name: The name of the log group under which the log stream is to be created.
        :param pulumi.Input[str] policy_document: Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        pulumi.set(__self__, "log_group_name", log_group_name)
        pulumi.set(__self__, "policy_document", policy_document)

    @property
    @pulumi.getter(name="logGroupName")
    def log_group_name(self) -> pulumi.Input[str]:
        """
        The name of the log group under which the log stream is to be created.
        """
        return pulumi.get(self, "log_group_name")

    @log_group_name.setter
    def log_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "log_group_name", value)

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> pulumi.Input[str]:
        """
        Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        return pulumi.get(self, "policy_document")

    @policy_document.setter
    def policy_document(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_document", value)


@pulumi.input_type
class _LogDataProtectionPolicyState:
    def __init__(__self__, *,
                 log_group_name: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogDataProtectionPolicy resources.
        :param pulumi.Input[str] log_group_name: The name of the log group under which the log stream is to be created.
        :param pulumi.Input[str] policy_document: Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        if log_group_name is not None:
            pulumi.set(__self__, "log_group_name", log_group_name)
        if policy_document is not None:
            pulumi.set(__self__, "policy_document", policy_document)

    @property
    @pulumi.getter(name="logGroupName")
    def log_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the log group under which the log stream is to be created.
        """
        return pulumi.get(self, "log_group_name")

    @log_group_name.setter
    def log_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_group_name", value)

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        return pulumi.get(self, "policy_document")

    @policy_document.setter
    def policy_document(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_document", value)


class LogDataProtectionPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 log_group_name: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CloudWatch Log Data Protection Policy resource.

        Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example_log_group = aws.cloudwatch.LogGroup("exampleLogGroup")
        example_bucket_v2 = aws.s3.BucketV2("exampleBucketV2")
        example_log_data_protection_policy = aws.cloudwatch.LogDataProtectionPolicy("exampleLogDataProtectionPolicy",
            log_group_name=example_log_group.name,
            policy_document=example_bucket_v2.bucket.apply(lambda bucket: json.dumps({
                "Name": "Example",
                "Version": "2021-06-01",
                "Statement": [
                    {
                        "Sid": "Audit",
                        "DataIdentifier": ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
                        "Operation": {
                            "Audit": {
                                "FindingsDestination": {
                                    "S3": {
                                        "Bucket": bucket,
                                    },
                                },
                            },
                        },
                    },
                    {
                        "Sid": "Redact",
                        "DataIdentifier": ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
                        "Operation": {
                            "Deidentify": {
                                "MaskConfig": {},
                            },
                        },
                    },
                ],
            })))
        ```

        ## Import

        Using `pulumi import`, import this resource using the `log_group_name`. For example:

        ```sh
         $ pulumi import aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy example my-log-group
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] log_group_name: The name of the log group under which the log stream is to be created.
        :param pulumi.Input[str] policy_document: Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogDataProtectionPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CloudWatch Log Data Protection Policy resource.

        Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example_log_group = aws.cloudwatch.LogGroup("exampleLogGroup")
        example_bucket_v2 = aws.s3.BucketV2("exampleBucketV2")
        example_log_data_protection_policy = aws.cloudwatch.LogDataProtectionPolicy("exampleLogDataProtectionPolicy",
            log_group_name=example_log_group.name,
            policy_document=example_bucket_v2.bucket.apply(lambda bucket: json.dumps({
                "Name": "Example",
                "Version": "2021-06-01",
                "Statement": [
                    {
                        "Sid": "Audit",
                        "DataIdentifier": ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
                        "Operation": {
                            "Audit": {
                                "FindingsDestination": {
                                    "S3": {
                                        "Bucket": bucket,
                                    },
                                },
                            },
                        },
                    },
                    {
                        "Sid": "Redact",
                        "DataIdentifier": ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
                        "Operation": {
                            "Deidentify": {
                                "MaskConfig": {},
                            },
                        },
                    },
                ],
            })))
        ```

        ## Import

        Using `pulumi import`, import this resource using the `log_group_name`. For example:

        ```sh
         $ pulumi import aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy example my-log-group
        ```

        :param str resource_name: The name of the resource.
        :param LogDataProtectionPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogDataProtectionPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 log_group_name: Optional[pulumi.Input[str]] = None,
                 policy_document: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogDataProtectionPolicyArgs.__new__(LogDataProtectionPolicyArgs)

            if log_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'log_group_name'")
            __props__.__dict__["log_group_name"] = log_group_name
            if policy_document is None and not opts.urn:
                raise TypeError("Missing required property 'policy_document'")
            __props__.__dict__["policy_document"] = policy_document
        super(LogDataProtectionPolicy, __self__).__init__(
            'aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            log_group_name: Optional[pulumi.Input[str]] = None,
            policy_document: Optional[pulumi.Input[str]] = None) -> 'LogDataProtectionPolicy':
        """
        Get an existing LogDataProtectionPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] log_group_name: The name of the log group under which the log stream is to be created.
        :param pulumi.Input[str] policy_document: Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogDataProtectionPolicyState.__new__(_LogDataProtectionPolicyState)

        __props__.__dict__["log_group_name"] = log_group_name
        __props__.__dict__["policy_document"] = policy_document
        return LogDataProtectionPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="logGroupName")
    def log_group_name(self) -> pulumi.Output[str]:
        """
        The name of the log group under which the log stream is to be created.
        """
        return pulumi.get(self, "log_group_name")

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> pulumi.Output[str]:
        """
        Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        """
        return pulumi.get(self, "policy_document")

