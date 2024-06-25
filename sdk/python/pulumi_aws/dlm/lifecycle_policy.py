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
from . import outputs
from ._inputs import *

__all__ = ['LifecyclePolicyArgs', 'LifecyclePolicy']

@pulumi.input_type
class LifecyclePolicyArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 execution_role_arn: pulumi.Input[str],
                 policy_details: pulumi.Input['LifecyclePolicyPolicyDetailsArgs'],
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LifecyclePolicy resource.
        :param pulumi.Input[str] description: A description for the DLM lifecycle policy.
        :param pulumi.Input[str] execution_role_arn: The ARN of an IAM role that is able to be assumed by the DLM service.
        :param pulumi.Input['LifecyclePolicyPolicyDetailsArgs'] policy_details: See the `policy_details` configuration block. Max of 1.
        :param pulumi.Input[str] state: Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "execution_role_arn", execution_role_arn)
        pulumi.set(__self__, "policy_details", policy_details)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        A description for the DLM lifecycle policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="executionRoleArn")
    def execution_role_arn(self) -> pulumi.Input[str]:
        """
        The ARN of an IAM role that is able to be assumed by the DLM service.
        """
        return pulumi.get(self, "execution_role_arn")

    @execution_role_arn.setter
    def execution_role_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "execution_role_arn", value)

    @property
    @pulumi.getter(name="policyDetails")
    def policy_details(self) -> pulumi.Input['LifecyclePolicyPolicyDetailsArgs']:
        """
        See the `policy_details` configuration block. Max of 1.
        """
        return pulumi.get(self, "policy_details")

    @policy_details.setter
    def policy_details(self, value: pulumi.Input['LifecyclePolicyPolicyDetailsArgs']):
        pulumi.set(self, "policy_details", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LifecyclePolicyState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execution_role_arn: Optional[pulumi.Input[str]] = None,
                 policy_details: Optional[pulumi.Input['LifecyclePolicyPolicyDetailsArgs']] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering LifecyclePolicy resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
        :param pulumi.Input[str] description: A description for the DLM lifecycle policy.
        :param pulumi.Input[str] execution_role_arn: The ARN of an IAM role that is able to be assumed by the DLM service.
        :param pulumi.Input['LifecyclePolicyPolicyDetailsArgs'] policy_details: See the `policy_details` configuration block. Max of 1.
        :param pulumi.Input[str] state: Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if execution_role_arn is not None:
            pulumi.set(__self__, "execution_role_arn", execution_role_arn)
        if policy_details is not None:
            pulumi.set(__self__, "policy_details", policy_details)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the DLM lifecycle policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="executionRoleArn")
    def execution_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of an IAM role that is able to be assumed by the DLM service.
        """
        return pulumi.get(self, "execution_role_arn")

    @execution_role_arn.setter
    def execution_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execution_role_arn", value)

    @property
    @pulumi.getter(name="policyDetails")
    def policy_details(self) -> Optional[pulumi.Input['LifecyclePolicyPolicyDetailsArgs']]:
        """
        See the `policy_details` configuration block. Max of 1.
        """
        return pulumi.get(self, "policy_details")

    @policy_details.setter
    def policy_details(self, value: Optional[pulumi.Input['LifecyclePolicyPolicyDetailsArgs']]):
        pulumi.set(self, "policy_details", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class LifecyclePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execution_role_arn: Optional[pulumi.Input[str]] = None,
                 policy_details: Optional[pulumi.Input[Union['LifecyclePolicyPolicyDetailsArgs', 'LifecyclePolicyPolicyDetailsArgsDict']]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots.

        ## Example Usage

        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[{
            "effect": "Allow",
            "principals": [{
                "type": "Service",
                "identifiers": ["dlm.amazonaws.com"],
            }],
            "actions": ["sts:AssumeRole"],
        }])
        dlm_lifecycle_role = aws.iam.Role("dlm_lifecycle_role",
            name="dlm-lifecycle-role",
            assume_role_policy=assume_role.json)
        dlm_lifecycle = aws.iam.get_policy_document(statements=[
            {
                "effect": "Allow",
                "actions": [
                    "ec2:CreateSnapshot",
                    "ec2:CreateSnapshots",
                    "ec2:DeleteSnapshot",
                    "ec2:DescribeInstances",
                    "ec2:DescribeVolumes",
                    "ec2:DescribeSnapshots",
                ],
                "resources": ["*"],
            },
            {
                "effect": "Allow",
                "actions": ["ec2:CreateTags"],
                "resources": ["arn:aws:ec2:*::snapshot/*"],
            },
        ])
        dlm_lifecycle_role_policy = aws.iam.RolePolicy("dlm_lifecycle",
            name="dlm-lifecycle-policy",
            role=dlm_lifecycle_role.id,
            policy=dlm_lifecycle.json)
        example = aws.dlm.LifecyclePolicy("example",
            description="example DLM lifecycle policy",
            execution_role_arn=dlm_lifecycle_role.arn,
            state="ENABLED",
            policy_details={
                "resourceTypes": "VOLUME",
                "schedules": [{
                    "name": "2 weeks of daily snapshots",
                    "createRule": {
                        "interval": 24,
                        "intervalUnit": "HOURS",
                        "times": "23:45",
                    },
                    "retainRule": {
                        "count": 14,
                    },
                    "tagsToAdd": {
                        "SnapshotCreator": "DLM",
                    },
                    "copyTags": False,
                }],
                "targetTags": {
                    "Snapshot": "true",
                },
            })
        ```

        ### Example Cross-Region Snapshot Copy Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        # ...other configuration...
        current = aws.get_caller_identity()
        key = aws.iam.get_policy_document(statements=[{
            "sid": "Enable IAM User Permissions",
            "effect": "Allow",
            "principals": [{
                "type": "AWS",
                "identifiers": [f"arn:aws:iam::{current.account_id}:root"],
            }],
            "actions": ["kms:*"],
            "resources": ["*"],
        }])
        dlm_cross_region_copy_cmk = aws.kms.Key("dlm_cross_region_copy_cmk",
            description="Example Alternate Region KMS Key",
            policy=key.json)
        example = aws.dlm.LifecyclePolicy("example",
            description="example DLM lifecycle policy",
            execution_role_arn=dlm_lifecycle_role["arn"],
            state="ENABLED",
            policy_details={
                "resourceTypes": "VOLUME",
                "schedules": [{
                    "name": "2 weeks of daily snapshots",
                    "createRule": {
                        "interval": 24,
                        "intervalUnit": "HOURS",
                        "times": "23:45",
                    },
                    "retainRule": {
                        "count": 14,
                    },
                    "tagsToAdd": {
                        "SnapshotCreator": "DLM",
                    },
                    "copyTags": False,
                    "crossRegionCopyRules": [{
                        "target": "us-west-2",
                        "encrypted": True,
                        "cmkArn": dlm_cross_region_copy_cmk.arn,
                        "copyTags": True,
                        "retainRule": {
                            "interval": 30,
                            "intervalUnit": "DAYS",
                        },
                    }],
                }],
                "targetTags": {
                    "Snapshot": "true",
                },
            })
        ```

        ### Example Event Based Policy Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.get_caller_identity()
        example_lifecycle_policy = aws.dlm.LifecyclePolicy("example",
            description="tf-acc-basic",
            execution_role_arn=example_aws_iam_role["arn"],
            policy_details={
                "policyType": "EVENT_BASED_POLICY",
                "action": {
                    "name": "tf-acc-basic",
                    "crossRegionCopies": [{
                        "encryptionConfiguration": {},
                        "retainRule": {
                            "interval": 15,
                            "intervalUnit": "MONTHS",
                        },
                        "target": "us-east-1",
                    }],
                },
                "eventSource": {
                    "type": "MANAGED_CWE",
                    "parameters": {
                        "descriptionRegex": "^.*Created for policy: policy-1234567890abcdef0.*$",
                        "eventType": "shareSnapshot",
                        "snapshotOwners": [current.account_id],
                    },
                },
            })
        example = aws.iam.get_policy(name="AWSDataLifecycleManagerServiceRole")
        example_role_policy_attachment = aws.iam.RolePolicyAttachment("example",
            role=example_aws_iam_role["id"],
            policy_arn=example.arn)
        ```

        ## Import

        Using `pulumi import`, import DLM lifecycle policies using their policy ID. For example:

        ```sh
        $ pulumi import aws:dlm/lifecyclePolicy:LifecyclePolicy example policy-abcdef12345678901
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the DLM lifecycle policy.
        :param pulumi.Input[str] execution_role_arn: The ARN of an IAM role that is able to be assumed by the DLM service.
        :param pulumi.Input[Union['LifecyclePolicyPolicyDetailsArgs', 'LifecyclePolicyPolicyDetailsArgsDict']] policy_details: See the `policy_details` configuration block. Max of 1.
        :param pulumi.Input[str] state: Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LifecyclePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots.

        ## Example Usage

        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        assume_role = aws.iam.get_policy_document(statements=[{
            "effect": "Allow",
            "principals": [{
                "type": "Service",
                "identifiers": ["dlm.amazonaws.com"],
            }],
            "actions": ["sts:AssumeRole"],
        }])
        dlm_lifecycle_role = aws.iam.Role("dlm_lifecycle_role",
            name="dlm-lifecycle-role",
            assume_role_policy=assume_role.json)
        dlm_lifecycle = aws.iam.get_policy_document(statements=[
            {
                "effect": "Allow",
                "actions": [
                    "ec2:CreateSnapshot",
                    "ec2:CreateSnapshots",
                    "ec2:DeleteSnapshot",
                    "ec2:DescribeInstances",
                    "ec2:DescribeVolumes",
                    "ec2:DescribeSnapshots",
                ],
                "resources": ["*"],
            },
            {
                "effect": "Allow",
                "actions": ["ec2:CreateTags"],
                "resources": ["arn:aws:ec2:*::snapshot/*"],
            },
        ])
        dlm_lifecycle_role_policy = aws.iam.RolePolicy("dlm_lifecycle",
            name="dlm-lifecycle-policy",
            role=dlm_lifecycle_role.id,
            policy=dlm_lifecycle.json)
        example = aws.dlm.LifecyclePolicy("example",
            description="example DLM lifecycle policy",
            execution_role_arn=dlm_lifecycle_role.arn,
            state="ENABLED",
            policy_details={
                "resourceTypes": "VOLUME",
                "schedules": [{
                    "name": "2 weeks of daily snapshots",
                    "createRule": {
                        "interval": 24,
                        "intervalUnit": "HOURS",
                        "times": "23:45",
                    },
                    "retainRule": {
                        "count": 14,
                    },
                    "tagsToAdd": {
                        "SnapshotCreator": "DLM",
                    },
                    "copyTags": False,
                }],
                "targetTags": {
                    "Snapshot": "true",
                },
            })
        ```

        ### Example Cross-Region Snapshot Copy Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        # ...other configuration...
        current = aws.get_caller_identity()
        key = aws.iam.get_policy_document(statements=[{
            "sid": "Enable IAM User Permissions",
            "effect": "Allow",
            "principals": [{
                "type": "AWS",
                "identifiers": [f"arn:aws:iam::{current.account_id}:root"],
            }],
            "actions": ["kms:*"],
            "resources": ["*"],
        }])
        dlm_cross_region_copy_cmk = aws.kms.Key("dlm_cross_region_copy_cmk",
            description="Example Alternate Region KMS Key",
            policy=key.json)
        example = aws.dlm.LifecyclePolicy("example",
            description="example DLM lifecycle policy",
            execution_role_arn=dlm_lifecycle_role["arn"],
            state="ENABLED",
            policy_details={
                "resourceTypes": "VOLUME",
                "schedules": [{
                    "name": "2 weeks of daily snapshots",
                    "createRule": {
                        "interval": 24,
                        "intervalUnit": "HOURS",
                        "times": "23:45",
                    },
                    "retainRule": {
                        "count": 14,
                    },
                    "tagsToAdd": {
                        "SnapshotCreator": "DLM",
                    },
                    "copyTags": False,
                    "crossRegionCopyRules": [{
                        "target": "us-west-2",
                        "encrypted": True,
                        "cmkArn": dlm_cross_region_copy_cmk.arn,
                        "copyTags": True,
                        "retainRule": {
                            "interval": 30,
                            "intervalUnit": "DAYS",
                        },
                    }],
                }],
                "targetTags": {
                    "Snapshot": "true",
                },
            })
        ```

        ### Example Event Based Policy Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        current = aws.get_caller_identity()
        example_lifecycle_policy = aws.dlm.LifecyclePolicy("example",
            description="tf-acc-basic",
            execution_role_arn=example_aws_iam_role["arn"],
            policy_details={
                "policyType": "EVENT_BASED_POLICY",
                "action": {
                    "name": "tf-acc-basic",
                    "crossRegionCopies": [{
                        "encryptionConfiguration": {},
                        "retainRule": {
                            "interval": 15,
                            "intervalUnit": "MONTHS",
                        },
                        "target": "us-east-1",
                    }],
                },
                "eventSource": {
                    "type": "MANAGED_CWE",
                    "parameters": {
                        "descriptionRegex": "^.*Created for policy: policy-1234567890abcdef0.*$",
                        "eventType": "shareSnapshot",
                        "snapshotOwners": [current.account_id],
                    },
                },
            })
        example = aws.iam.get_policy(name="AWSDataLifecycleManagerServiceRole")
        example_role_policy_attachment = aws.iam.RolePolicyAttachment("example",
            role=example_aws_iam_role["id"],
            policy_arn=example.arn)
        ```

        ## Import

        Using `pulumi import`, import DLM lifecycle policies using their policy ID. For example:

        ```sh
        $ pulumi import aws:dlm/lifecyclePolicy:LifecyclePolicy example policy-abcdef12345678901
        ```

        :param str resource_name: The name of the resource.
        :param LifecyclePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LifecyclePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 execution_role_arn: Optional[pulumi.Input[str]] = None,
                 policy_details: Optional[pulumi.Input[Union['LifecyclePolicyPolicyDetailsArgs', 'LifecyclePolicyPolicyDetailsArgsDict']]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LifecyclePolicyArgs.__new__(LifecyclePolicyArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if execution_role_arn is None and not opts.urn:
                raise TypeError("Missing required property 'execution_role_arn'")
            __props__.__dict__["execution_role_arn"] = execution_role_arn
            if policy_details is None and not opts.urn:
                raise TypeError("Missing required property 'policy_details'")
            __props__.__dict__["policy_details"] = policy_details
            __props__.__dict__["state"] = state
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(LifecyclePolicy, __self__).__init__(
            'aws:dlm/lifecyclePolicy:LifecyclePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            execution_role_arn: Optional[pulumi.Input[str]] = None,
            policy_details: Optional[pulumi.Input[Union['LifecyclePolicyPolicyDetailsArgs', 'LifecyclePolicyPolicyDetailsArgsDict']]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'LifecyclePolicy':
        """
        Get an existing LifecyclePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
        :param pulumi.Input[str] description: A description for the DLM lifecycle policy.
        :param pulumi.Input[str] execution_role_arn: The ARN of an IAM role that is able to be assumed by the DLM service.
        :param pulumi.Input[Union['LifecyclePolicyPolicyDetailsArgs', 'LifecyclePolicyPolicyDetailsArgsDict']] policy_details: See the `policy_details` configuration block. Max of 1.
        :param pulumi.Input[str] state: Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LifecyclePolicyState.__new__(_LifecyclePolicyState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["execution_role_arn"] = execution_role_arn
        __props__.__dict__["policy_details"] = policy_details
        __props__.__dict__["state"] = state
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return LifecyclePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description for the DLM lifecycle policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="executionRoleArn")
    def execution_role_arn(self) -> pulumi.Output[str]:
        """
        The ARN of an IAM role that is able to be assumed by the DLM service.
        """
        return pulumi.get(self, "execution_role_arn")

    @property
    @pulumi.getter(name="policyDetails")
    def policy_details(self) -> pulumi.Output['outputs.LifecyclePolicyPolicyDetails']:
        """
        See the `policy_details` configuration block. Max of 1.
        """
        return pulumi.get(self, "policy_details")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[Optional[str]]:
        """
        Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

